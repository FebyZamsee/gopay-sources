package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    private static final ValueEncoder<Boolean> BOOLEAN_ENCODER = new JsonDataEncoderBuilder$$ExternalSyntheticLambda2();
    private static final ObjectEncoder<Object> DEFAULT_FALLBACK_ENCODER = new JsonDataEncoderBuilder$$ExternalSyntheticLambda0();
    private static final ValueEncoder<String> STRING_ENCODER = new JsonDataEncoderBuilder$$ExternalSyntheticLambda1();
    private static final TimestampEncoder TIMESTAMP_ENCODER = new TimestampEncoder();
    /* access modifiers changed from: private */
    public ObjectEncoder<Object> fallbackEncoder = DEFAULT_FALLBACK_ENCODER;
    /* access modifiers changed from: private */
    public boolean ignoreNullValues = false;
    /* access modifiers changed from: private */
    public final Map<Class<?>, ObjectEncoder<?>> objectEncoders = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, ValueEncoder<?>> valueEncoders = new HashMap();

    static /* synthetic */ void lambda$static$0(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        StringBuilder sb = new StringBuilder("Couldn't find encoder for type ");
        sb.append(obj.getClass().getCanonicalName());
        throw new EncodingException(sb.toString());
    }

    static final class TimestampEncoder implements ValueEncoder<Date> {
        private static final DateFormat rfc339;

        private TimestampEncoder() {
        }

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            rfc339 = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public final void encode(Date date, ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(rfc339.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, STRING_ENCODER);
        registerEncoder(Boolean.class, BOOLEAN_ENCODER);
        registerEncoder(Date.class, TIMESTAMP_ENCODER);
    }

    public final <T> JsonDataEncoderBuilder registerEncoder(Class<T> cls, ObjectEncoder<? super T> objectEncoder) {
        this.objectEncoders.put(cls, objectEncoder);
        this.valueEncoders.remove(cls);
        return this;
    }

    public final <T> JsonDataEncoderBuilder registerEncoder(Class<T> cls, ValueEncoder<? super T> valueEncoder) {
        this.valueEncoders.put(cls, valueEncoder);
        this.objectEncoders.remove(cls);
        return this;
    }

    public final JsonDataEncoderBuilder configureWith(Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    public final JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.ignoreNullValues = z;
        return this;
    }

    public final DataEncoder build() {
        return new DataEncoder() {
            public void encode(Object obj, Writer writer) throws IOException {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.objectEncoders, JsonDataEncoderBuilder.this.valueEncoders, JsonDataEncoderBuilder.this.fallbackEncoder, JsonDataEncoderBuilder.this.ignoreNullValues);
                jsonValueObjectEncoderContext.add(obj, false);
                jsonValueObjectEncoderContext.close();
            }

            public String encode(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }
}
