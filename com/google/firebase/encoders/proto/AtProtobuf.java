package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

public final class AtProtobuf {
    private Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
    private int tag;

    public final AtProtobuf tag(int i) {
        this.tag = i;
        return this;
    }

    public static AtProtobuf builder() {
        return new AtProtobuf();
    }

    public final Protobuf build() {
        return new ProtobufImpl(this.tag, this.intEncoding);
    }

    static final class ProtobufImpl implements Protobuf {
        private final Protobuf.IntEncoding intEncoding;
        private final int tag;

        ProtobufImpl(int i, Protobuf.IntEncoding intEncoding2) {
            this.tag = i;
            this.intEncoding = intEncoding2;
        }

        public final Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        public final int tag() {
            return this.tag;
        }

        public final Protobuf.IntEncoding intEncoding() {
            return this.intEncoding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.tag != protobuf.tag() || !this.intEncoding.equals(protobuf.intEncoding())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.tag ^ 14552422) + (this.intEncoding.hashCode() ^ 2041407134);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("@com.google.firebase.encoders.proto.Protobuf(tag=");
            sb.append(this.tag);
            sb.append("intEncoding=");
            sb.append(this.intEncoding);
            sb.append(')');
            return sb.toString();
        }
    }
}
