package com.google.firebase.remoteconfig.interop.rollouts;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

public final class AutoRolloutAssignmentEncoder implements Configurator {
    public static final Configurator CONFIG = new AutoRolloutAssignmentEncoder();

    private AutoRolloutAssignmentEncoder() {
    }

    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(RolloutAssignment.class, RolloutAssignmentEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_RolloutAssignment.class, RolloutAssignmentEncoder.INSTANCE);
    }

    static final class RolloutAssignmentEncoder implements ObjectEncoder<RolloutAssignment> {
        static final RolloutAssignmentEncoder INSTANCE = new RolloutAssignmentEncoder();
        private static final FieldDescriptor PARAMETERKEY_DESCRIPTOR = FieldDescriptor.of("parameterKey");
        private static final FieldDescriptor PARAMETERVALUE_DESCRIPTOR = FieldDescriptor.of("parameterValue");
        private static final FieldDescriptor ROLLOUTID_DESCRIPTOR = FieldDescriptor.of("rolloutId");
        private static final FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = FieldDescriptor.of("templateVersion");
        private static final FieldDescriptor VARIANTID_DESCRIPTOR = FieldDescriptor.of("variantId");

        private RolloutAssignmentEncoder() {
        }

        public final void encode(RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ROLLOUTID_DESCRIPTOR, (Object) rolloutAssignment.getRolloutId());
            objectEncoderContext.add(VARIANTID_DESCRIPTOR, (Object) rolloutAssignment.getVariantId());
            objectEncoderContext.add(PARAMETERKEY_DESCRIPTOR, (Object) rolloutAssignment.getParameterKey());
            objectEncoderContext.add(PARAMETERVALUE_DESCRIPTOR, (Object) rolloutAssignment.getParameterValue());
            objectEncoderContext.add(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }
}
