package com.gojek.ojosdk;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.updateNavigationIcon;

public final class Ojo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public enum AuroraColors {
        OTHER(-1),
        RED(16727140),
        GREEN(3988540),
        BLUE(3932415),
        YELLOW(16762940),
        WHITE(ViewCompat.MEASURED_SIZE_MASK);
        
        private final int value;

        private AuroraColors(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum CardType {
        KTP(0),
        SIM(1),
        SELFIE(2),
        SELFIE_WITH_ID(3);
        
        private final int value;

        private CardType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ErrorCode createInstance$default(Companion companion, CardType cardType, int i, Rotation rotation, int i2, String str, Context context, String str2, int i3, Object obj) {
            return companion.createInstance(cardType, i, rotation, (i3 & 8) != 0 ? 5 : i2, (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? null : context, (i3 & 64) != 0 ? "" : str2);
        }

        public static /* synthetic */ ErrorCode detectFace$default(Companion companion, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str, int i9, Object obj) {
            int i10 = i9;
            return companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, (i10 & 8192) != 0 ? false : z, (i10 & 16384) != 0 ? true : z2, (32768 & i10) != 0 ? true : z3, (65536 & i10) != 0 ? true : z4, (131072 & i10) != 0 ? true : z5, (262144 & i10) != 0 ? true : z6, (524288 & i10) != 0 ? false : z7, (1048576 & i10) != 0 ? -1 : j, (2097152 & i10) != 0 ? -1 : j2, (i10 & 4194304) != 0 ? "WHITE" : str);
        }

        public static /* synthetic */ ErrorCode detectFaceByteArray$default(Companion companion, byte[] bArr, int i, int i2, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str, int i3, Object obj) {
            int i4 = i3;
            return companion.detectFaceByteArray(bArr, i, i2, pixelFormat, detectionResult, (i4 & 32) != 0 ? false : z, (i4 & 64) != 0 ? true : z2, (i4 & 128) != 0 ? true : z3, (i4 & 256) != 0 ? true : z4, (i4 & 512) != 0 ? true : z5, (i4 & 1024) != 0 ? true : z6, (i4 & 2048) != 0 ? false : z7, (i4 & 4096) != 0 ? -1 : j, (i4 & 8192) != 0 ? -1 : j2, (i4 & 16384) != 0 ? "WHITE" : str);
        }

        public static /* synthetic */ ErrorCode saveAuroraFrames$default(Companion companion, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 100;
            }
            return companion.saveAuroraFrames(str, i);
        }

        public static /* synthetic */ ErrorCode saveBestFrame$default(Companion companion, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
            return companion.saveBestFrame(str, str2, str3, (i2 & 8) != 0 ? 100 : i, (i2 & 16) != 0 ? false : z);
        }

        public static /* synthetic */ ErrorCode saveSecondFrame$default(Companion companion, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
            return companion.saveSecondFrame(str, str2, str3, (i2 & 8) != 0 ? 100 : i, (i2 & 16) != 0 ? false : z);
        }

        public static /* synthetic */ ErrorCode setKtpThresholds$default(Companion companion, float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3, int i4, int i5, int i6, Object obj) {
            int i7 = i6;
            float f12 = 0.37f;
            float f13 = (i7 & 1) != 0 ? 0.37f : f;
            float f14 = (i7 & 2) != 0 ? 0.46f : f2;
            float f15 = (i7 & 4) != 0 ? 0.35f : f3;
            if ((i7 & 8) == 0) {
                f12 = f4;
            }
            float f16 = 0.15f;
            float f17 = (i7 & 16) != 0 ? 0.15f : f5;
            int i8 = (i7 & 32) != 0 ? 1000 : i;
            int i9 = (i7 & 64) != 0 ? 3 : i2;
            float f18 = (i7 & 128) != 0 ? 112.0f : f6;
            float f19 = (i7 & 256) != 0 ? 150.0f : f7;
            if ((i7 & 512) == 0) {
                f16 = f8;
            }
            return companion.setKtpThresholds(f13, f14, f15, f12, f17, i8, i9, f18, f19, f16, (i7 & 1024) != 0 ? 0.45f : f9, (i7 & 2048) != 0 ? 0.71f : f10, (i7 & 4096) != 0 ? 0.4f : f11, (i7 & 8192) != 0 ? 30 : i3, (i7 & 16384) != 0 ? 1000 : i4, (i7 & 32768) != 0 ? 25 : i5);
        }

        public static /* synthetic */ ErrorCode setModelParameters$default(Companion companion, AssetManager assetManager, int i, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return companion.setModelParameters(assetManager, i, z);
        }

        public static /* synthetic */ ErrorCode setSelfieThresholds$default(Companion companion, float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10, int i11, float f26, int i12, int i13, Object obj) {
            int i14 = i12;
            int i15 = i13;
            float f27 = (i14 & 1) != 0 ? -1.0f : f;
            boolean z5 = (i14 & 2) != 0 ? false : z;
            int i16 = (i14 & 4) != 0 ? -1 : i;
            int i17 = (i14 & 8) != 0 ? -1 : i2;
            int i18 = (i14 & 16) != 0 ? -1 : i3;
            long j5 = -1;
            long j6 = (i14 & 32) != 0 ? -1 : j;
            int i19 = (i14 & 64) != 0 ? -1 : i4;
            float f28 = (i14 & 128) != 0 ? -1.0f : f2;
            long j7 = (i14 & 256) != 0 ? -1 : j2;
            int i20 = (i14 & 512) != 0 ? -1 : i5;
            long j8 = (i14 & 1024) != 0 ? -1 : j3;
            if ((i14 & 2048) == 0) {
                j5 = j4;
            }
            float f29 = (i14 & 4096) != 0 ? -1.0f : f3;
            float f30 = (i14 & 8192) != 0 ? -1.0f : f4;
            float f31 = (i14 & 16384) != 0 ? -1.0f : f5;
            float f32 = (i14 & 32768) != 0 ? -1.0f : f6;
            float f33 = (i14 & 65536) != 0 ? -1.0f : f7;
            boolean z6 = true;
            boolean z7 = (i14 & 131072) != 0 ? true : z2;
            float f34 = (i14 & 262144) != 0 ? -1.0f : f8;
            if ((i14 & 524288) == 0) {
                z6 = z3;
            }
            return companion.setSelfieThresholds(f27, z5, i16, i17, i18, j6, i19, f28, j7, i20, j8, j5, f29, f30, f31, f32, f33, z7, f34, z6, (i14 & 1048576) != 0 ? -1.0f : f9, (i14 & 2097152) != 0 ? -1.0f : f10, (i14 & 4194304) != 0 ? -1.0f : f11, (i14 & 8388608) != 0 ? -1.0f : f12, (i14 & 16777216) != 0 ? -1.0f : f13, (i14 & 33554432) != 0 ? -1.0f : f14, (i14 & 67108864) != 0 ? -1.0f : f15, (i14 & 134217728) != 0 ? -1.0f : f16, (i14 & 268435456) != 0 ? false : z4, (i14 & 536870912) != 0 ? -1.0f : f17, (i14 & BasicMeasure.EXACTLY) != 0 ? -1.0f : f18, (i14 & Integer.MIN_VALUE) != 0 ? -1 : i6, (i15 & 1) != 0 ? -1 : i7, (i15 & 2) != 0 ? -1.0f : f19, (i15 & 4) != 0 ? -1.0f : f20, (i15 & 8) != 0 ? -1.0f : f21, (i15 & 16) != 0 ? -1.0f : f22, (i15 & 32) != 0 ? -1.0f : f23, (i15 & 64) != 0 ? -1.0f : f24, (i15 & 128) != 0 ? -1.0f : f25, (i15 & 256) != 0 ? -1 : i8, (i15 & 512) != 0 ? -1 : i9, (i15 & 1024) != 0 ? -1 : i10, (i15 & 2048) != 0 ? -1 : i11, (i15 & 4096) != 0 ? -1.0f : f26);
        }

        public static /* synthetic */ ErrorCode setWeights$default(Companion companion, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17, float f18, float f19, int i3, Object obj) {
            int i4 = i3;
            float f20 = 1.0f;
            float f21 = (i4 & 1) != 0 ? 1.0f : f;
            float f22 = (i4 & 2) != 0 ? 1.0f : f2;
            float f23 = (i4 & 4) != 0 ? 1.0f : f3;
            float f24 = (i4 & 8) != 0 ? 1.0f : f4;
            float f25 = (i4 & 16) != 0 ? 1.0f : f5;
            float f26 = (i4 & 32) != 0 ? 1.0f : f6;
            float f27 = (i4 & 64) != 0 ? 1.0f : f7;
            float f28 = (i4 & 128) != 0 ? 1.0f : f8;
            float f29 = (i4 & 256) != 0 ? 1.0f : f9;
            float f30 = (i4 & 512) != 0 ? 1.0f : f10;
            float f31 = (i4 & 1024) != 0 ? 1.0f : f11;
            float f32 = (i4 & 2048) != 0 ? 1.0f : f12;
            if ((i4 & 4096) == 0) {
                f20 = f13;
            }
            int i5 = (i4 & 8192) != 0 ? 30 : i;
            int i6 = (i4 & 16384) != 0 ? 30 : i2;
            float f33 = 0.8f;
            float f34 = (i4 & 32768) != 0 ? 0.8f : f14;
            float f35 = (i4 & 65536) != 0 ? 0.94f : f15;
            float f36 = (i4 & 131072) != 0 ? 0.0f : f16;
            float f37 = (i4 & 262144) != 0 ? 0.02f : f17;
            float f38 = (i4 & 524288) != 0 ? 0.9f : f18;
            if ((i4 & 1048576) == 0) {
                f33 = f19;
            }
            return companion.setWeights(f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f20, i5, i6, f34, f35, f36, f37, f38, f33);
        }

        public final ErrorCode createInstance(CardType cardType, int i, Rotation rotation, int i2, String str, Context context, String str2) {
            return Ojo.createInstance(cardType, i, rotation, i2, str, context, str2);
        }

        public final ErrorCode destroyInstance() {
            return Ojo.destroyInstance();
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, false, false, false, false, false, false, false, 0, 0, (String) null, 8380416, (Object) null);
        }

        public final ErrorCode detectFaceByteArray(byte[] bArr, int i, int i2, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str) {
            return Ojo.detectFaceByteArray(bArr, i, i2, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, j, j2, str);
        }

        public final String encrypt(String str) {
            return Ojo.encrypt(str);
        }

        public final String getAuroraZipName() {
            return Ojo.getAuroraZipName();
        }

        public final native float[] getFeScore();

        public final String getOjoLogFileName() {
            return Ojo.getOjoLogFileName();
        }

        public final String getVersion() {
            return Ojo.getVersion();
        }

        public final String runBenchmark(byte[] bArr, int i, int i2, String str, int i3, int i4) {
            return Ojo.runBenchmark(bArr, i, i2, str, i3, i4);
        }

        public final native ErrorCode saveAuroraFrames(String str, int i);

        public final ErrorCode saveBestFrame(String str, String str2, String str3, int i, boolean z) {
            return Ojo.saveBestFrame(str, str2, str3, i, z);
        }

        public final ErrorCode saveSecondFrame(String str, String str2, String str3, int i, boolean z) {
            return Ojo.saveSecondFrame(str, str2, str3, i, z);
        }

        public final ErrorCode setKtpThresholds() {
            return setKtpThresholds$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65535, (Object) null);
        }

        public final ErrorCode setModelParameters(AssetManager assetManager, int i, boolean z) {
            return Ojo.setModelParameters(assetManager, i, z);
        }

        public final int setNumFrames(int i) {
            return Ojo.setNumFrames(i);
        }

        public final ErrorCode setROIPercentage(Rect rect, int i, int i2) {
            return Ojo.setROIPercentage(rect, i, i2);
        }

        public final ErrorCode setSelfieThresholds() {
            return setSelfieThresholds$default(this, 0.0f, false, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -1, 8191, (Object) null);
        }

        public final ErrorCode setWeights() {
            return setWeights$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097151, (Object) null);
        }

        public static /* synthetic */ ErrorCode setModelParameters$default(Companion companion, String str, int i, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return companion.setModelParameters(str, i, z);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z) {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, false, false, false, false, false, false, 0, 0, (String) null, 8372224, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f) {
            return setKtpThresholds$default(this, f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65534, (Object) null);
        }

        public final ErrorCode setModelParameters(String str, int i, boolean z) {
            return Ojo.setModelParameters(str, i, z);
        }

        public final ErrorCode setSelfieThresholds(float f) {
            return setSelfieThresholds$default(this, f, false, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -2, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f) {
            return setWeights$default(this, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097150, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, false, false, false, false, false, 0, 0, (String) null, 8355840, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2) {
            return setKtpThresholds$default(this, f, f2, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65532, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z) {
            return setSelfieThresholds$default(this, f, z, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -4, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2) {
            return setWeights$default(this, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097148, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, false, false, false, false, 0, 0, (String) null, 8323072, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3) {
            return setKtpThresholds$default(this, f, f2, f3, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65528, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i) {
            return setSelfieThresholds$default(this, f, z, i, 0, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -8, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3) {
            return setWeights$default(this, f, f2, f3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097144, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, false, false, false, 0, 0, (String) null, 8257536, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4) {
            return setKtpThresholds$default(this, f, f2, f3, f4, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65520, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2) {
            return setSelfieThresholds$default(this, f, z, i, i2, 0, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -16, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4) {
            return setWeights$default(this, f, f2, f3, f4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097136, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, false, false, 0, 0, (String) null, 8126464, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65504, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, 0, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -32, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5) {
            return setWeights$default(this, f, f2, f3, f4, f5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097120, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, false, 0, 0, (String) null, 7864320, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65472, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, 0, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -64, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097088, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, 0, 0, (String) null, 7340032, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65408, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, 0.0f, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -128, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2097024, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, j, 0, (String) null, 6291456, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, MotionEventCompat.ACTION_POINTER_INDEX_MASK, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, InputDeviceCompat.SOURCE_ANY, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2096896, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2) {
            byte[] bArr4 = bArr;
            Intrinsics.checkNotNullParameter(bArr4, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(bArr3, "");
            Intrinsics.checkNotNullParameter(pixelFormat, "");
            Intrinsics.checkNotNullParameter(detectionResult, "");
            return detectFace$default(this, bArr4, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, j, j2, (String) null, 4194304, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 65024, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -512, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2096640, (Object) null);
        }

        public final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str) {
            return Ojo.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, j, j2, str);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, f8, 0.0f, 0.0f, 0.0f, 0, 0, 0, 64512, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -1024, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2096128, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, 0.0f, 0.0f, 0, 0, 0, 63488, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -2048, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2095104, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, 0.0f, 0, 0, 0, 61440, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -4096, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2093056, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11, 0, 0, 0, 57344, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -8192, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2088960, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11, i3, 0, 0, 49152, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, 0.0f, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -16384, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2080768, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3, int i4) {
            return setKtpThresholds$default(this, f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11, i3, i4, 0, 32768, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -32768, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2064384, (Object) null);
        }

        public final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3, int i4, int i5) {
            return Ojo.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11, i3, i4, i5);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, 0.0f, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, SupportMenu.CATEGORY_MASK, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2031616, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, false, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -131072, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, 0.0f, 0.0f, 0.0f, 0.0f, 1966080, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, 0.0f, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -262144, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16, 0.0f, 0.0f, 0.0f, 1835008, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, false, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -524288, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16, f17, 0.0f, 0.0f, 1572864, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -1048576, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17, float f18) {
            return setWeights$default(this, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16, f17, f18, 0.0f, 1048576, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -2097152, 8191, (Object) null);
        }

        public final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17, float f18, float f19) {
            return Ojo.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16, f17, f18, f19);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -4194304, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -8388608, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, ViewCompat.MEASURED_STATE_MASK, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -33554432, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, 0.0f, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -67108864, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, 0.0f, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -134217728, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, false, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -268435456, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -536870912, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, -1073741824, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, Integer.MIN_VALUE, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8191, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8190, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8188, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8184, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8176, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8160, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8128, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, 0.0f, 0, 0, 0, 0, 0.0f, 0, 8064, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, 0, 0, 0, 0, 0.0f, 0, 7936, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, 0, 0, 0, 0.0f, 0, 7680, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9, 0, 0, 0.0f, 0, 7168, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9, i10, 0, 0.0f, 0, 6144, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10, int i11) {
            return setSelfieThresholds$default(this, f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9, i10, i11, 0.0f, 0, 4096, (Object) null);
        }

        public final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10, int i11, float f26) {
            return Ojo.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9, i10, i11, f26);
        }
    }

    public static final class DetectionResult {
        private float aspectRatio;
        private AuroraColors auroraColors = AuroraColors.OTHER;
        private float backlightScore = -1.0f;
        private float backlightScoreRaw = -1.0f;
        private float blockScore = -1.0f;
        private float blockScoreRaw = -1.0f;
        private float blurScore = -1.0f;
        private float blurScoreRaw = -1.0f;
        private float damagedScore = -1.0f;
        private float damagedScoreRaw = -1.0f;
        private String edValues = "";
        private FacePose facePose = FacePose.UNKNOWN;
        private ArrayList<Face> faces = new ArrayList<>();
        private float highlightScore = -1.0f;
        private float highlightScoreRaw = -1.0f;
        private float lowlightScore = -1.0f;
        private float lowlightScoreRaw = -1.0f;
        private ArrayList<Object> objects = new ArrayList<>();
        private float okScore = -1.0f;
        private String rawValues = "";
        private float score = -1.0f;
        private Status status = Status.UNKNOWN;
        private int zoom = -1;
        private int zoomRaw = -1;

        public final float getAspectRatio() {
            return this.aspectRatio;
        }

        public final AuroraColors getAuroraColors() {
            return this.auroraColors;
        }

        public final float getBacklightScore() {
            return this.backlightScore;
        }

        public final float getBacklightScoreRaw() {
            return this.backlightScoreRaw;
        }

        public final float getBlockScore() {
            return this.blockScore;
        }

        public final float getBlockScoreRaw() {
            return this.blockScoreRaw;
        }

        public final float getBlurScore() {
            return this.blurScore;
        }

        public final float getBlurScoreRaw() {
            return this.blurScoreRaw;
        }

        public final float getDamagedScore() {
            return this.damagedScore;
        }

        public final float getDamagedScoreRaw() {
            return this.damagedScoreRaw;
        }

        public final String getEdValues() {
            return this.edValues;
        }

        public final FacePose getFacePose() {
            return this.facePose;
        }

        public final ArrayList<Face> getFaces() {
            return this.faces;
        }

        public final float getHighlightScore() {
            return this.highlightScore;
        }

        public final float getHighlightScoreRaw() {
            return this.highlightScoreRaw;
        }

        public final float getLowlightScore() {
            return this.lowlightScore;
        }

        public final float getLowlightScoreRaw() {
            return this.lowlightScoreRaw;
        }

        public final ArrayList<Object> getObjects() {
            return this.objects;
        }

        public final float getOkScore() {
            return this.okScore;
        }

        public final String getRawValues() {
            return this.rawValues;
        }

        public final float getScore() {
            return this.score;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final int getZoom() {
            return this.zoom;
        }

        public final int getZoomRaw() {
            return this.zoomRaw;
        }

        public final void setAspectRatio(float f) {
            this.aspectRatio = f;
        }

        public final void setAuroraColors(AuroraColors auroraColors2) {
            Intrinsics.checkNotNullParameter(auroraColors2, "");
            this.auroraColors = auroraColors2;
        }

        public final void setBacklightScore(float f) {
            this.backlightScore = f;
        }

        public final void setBacklightScoreRaw(float f) {
            this.backlightScoreRaw = f;
        }

        public final void setBlockScore(float f) {
            this.blockScore = f;
        }

        public final void setBlockScoreRaw(float f) {
            this.blockScoreRaw = f;
        }

        public final void setBlurScore(float f) {
            this.blurScore = f;
        }

        public final void setBlurScoreRaw(float f) {
            this.blurScoreRaw = f;
        }

        public final void setDamagedScore(float f) {
            this.damagedScore = f;
        }

        public final void setDamagedScoreRaw(float f) {
            this.damagedScoreRaw = f;
        }

        public final void setEdValues(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.edValues = str;
        }

        public final void setFacePose(FacePose facePose2) {
            Intrinsics.checkNotNullParameter(facePose2, "");
            this.facePose = facePose2;
        }

        public final void setFaces(ArrayList<Face> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.faces = arrayList;
        }

        public final void setHighlightScore(float f) {
            this.highlightScore = f;
        }

        public final void setHighlightScoreRaw(float f) {
            this.highlightScoreRaw = f;
        }

        public final void setLowlightScore(float f) {
            this.lowlightScore = f;
        }

        public final void setLowlightScoreRaw(float f) {
            this.lowlightScoreRaw = f;
        }

        public final void setObjects(ArrayList<Object> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.objects = arrayList;
        }

        public final void setOkScore(float f) {
            this.okScore = f;
        }

        public final void setRawValues(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.rawValues = str;
        }

        public final void setScore(float f) {
            this.score = f;
        }

        public final void setStatus(Status status2) {
            Intrinsics.checkNotNullParameter(status2, "");
            this.status = status2;
        }

        public final void setZoom(int i) {
            this.zoom = i;
        }

        public final void setZoomRaw(int i) {
            this.zoomRaw = i;
        }

        public final void setFaces(int[] iArr) {
            int[] iArr2 = iArr;
            Intrinsics.checkNotNullParameter(iArr2, "");
            this.faces.clear();
            int length = iArr2.length / 16;
            for (int i = 0; i < length; i++) {
                int i2 = i << 4;
                Rect rect = new Rect(iArr2[i2], iArr2[i2 + 1], iArr2[i2 + 2], iArr2[i2 + 3]);
                Landmark landmark = new Landmark(new Point(iArr2[i2 + 4], iArr2[i2 + 9]), new Point(iArr2[i2 + 5], iArr2[i2 + 10]), new Point(iArr2[i2 + 6], iArr2[i2 + 11]), new Point(iArr2[i2 + 7], iArr2[i2 + 12]), new Point(iArr2[i2 + 8], iArr2[i2 + 13]));
                ArrayList<Face> arrayList = this.faces;
                int i3 = iArr2[i2 + 14];
                boolean z = true;
                if (iArr2[i2 + 15] != 1) {
                    z = false;
                }
                arrayList.add(new Face(rect, landmark, i3, z));
            }
        }

        public final void setObjects(int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "");
            this.objects.clear();
            int length = iArr.length / 8;
            for (int i = 0; i < length; i++) {
                int i2 = i << 3;
                this.objects.add(new Object(new Rect(iArr[i2], iArr[i2 + 1], iArr[i2 + 2], iArr[i2 + 3]), iArr[i2 + 4] == 0 ? "e-KTP" : "Others", iArr[i2 + 5], iArr[i2 + 6] == 1, iArr[i2 + 7] == 1));
            }
        }

        public final HashMap<String, Object> toHashMap() {
            Pair[] pairArr = new Pair[23];
            pairArr[0] = new Pair("zoom", Integer.valueOf(this.zoom));
            ArrayList<Face> arrayList = this.faces;
            Intrinsics.checkNotNullParameter(arrayList, "");
            int i = 10;
            ArrayList arrayList2 = new ArrayList(arrayList instanceof Collection ? arrayList.size() : 10);
            for (Face hashMap : arrayList) {
                arrayList2.add(hashMap.toHashMap());
            }
            pairArr[1] = new Pair("faces", arrayList2);
            pairArr[2] = new Pair("facePose", this.facePose.name());
            pairArr[3] = new Pair("okScore", Float.valueOf(this.okScore));
            pairArr[4] = new Pair("blurScore", Float.valueOf(this.blurScore));
            pairArr[5] = new Pair("blockScore", Float.valueOf(this.blockScore));
            pairArr[6] = new Pair("lowlightScore", Float.valueOf(this.lowlightScore));
            pairArr[7] = new Pair("highlightScore", Float.valueOf(this.highlightScore));
            pairArr[8] = new Pair("backlightScore", Float.valueOf(this.backlightScore));
            pairArr[9] = new Pair("damagedScore", Float.valueOf(this.damagedScore));
            pairArr[10] = new Pair("blurScoreRaw", Float.valueOf(this.blurScoreRaw));
            pairArr[11] = new Pair("lowlightScoreRaw", Float.valueOf(this.lowlightScoreRaw));
            pairArr[12] = new Pair("highlightScoreRaw", Float.valueOf(this.highlightScoreRaw));
            pairArr[13] = new Pair("backlightScoreRaw", Float.valueOf(this.backlightScoreRaw));
            pairArr[14] = new Pair("damagedScoreRaw", Float.valueOf(this.damagedScoreRaw));
            pairArr[15] = new Pair("zoomRaw", Integer.valueOf(this.zoomRaw));
            pairArr[16] = new Pair("aspectRatio", Float.valueOf(this.aspectRatio));
            pairArr[17] = new Pair("rawValues", this.rawValues);
            pairArr[18] = new Pair("edValues", this.edValues);
            pairArr[19] = new Pair("auroraColors", this.auroraColors.name());
            pairArr[20] = new Pair(NotificationCompat.CATEGORY_STATUS, this.status.name());
            ArrayList<Object> arrayList3 = this.objects;
            Intrinsics.checkNotNullParameter(arrayList3, "");
            if (arrayList3 instanceof Collection) {
                i = arrayList3.size();
            }
            ArrayList arrayList4 = new ArrayList(i);
            for (Object hashMap2 : arrayList3) {
                arrayList4.add(hashMap2.toHashMap());
            }
            pairArr[21] = new Pair("objects", arrayList4);
            pairArr[22] = new Pair("score", Float.valueOf(this.score));
            Intrinsics.checkNotNullParameter(pairArr, "");
            HashMap<String, Object> hashMap3 = new HashMap<>(updateNavigationIcon.RemoteActionCompatParcelizer(23));
            updateNavigationIcon.asInterface(hashMap3, pairArr);
            return hashMap3;
        }
    }

    public enum ErrorCode {
        OK(0),
        NULLPTRERR(1),
        VALUEERR(2),
        ALLOCERR(3),
        MODELS_NOT_LOADED(4),
        FD_ERR(InputDeviceCompat.SOURCE_KEYBOARD),
        FD_ALLOCERR(258),
        FD_MEMERR(259),
        FD_MODELERR(260),
        FD_MODELPATHERR(261),
        FD_NULLPTRERR(262),
        IQ_ERR(InputDeviceCompat.SOURCE_DPAD),
        IQ_ALLOCERR(514),
        IQ_MEMERR(515),
        IQ_MODELERR(516),
        IQ_MODELPATHERR(517),
        IQ_NULLPTRERR(518),
        LD_ERR(769),
        LD_ALLOCERR(770),
        LD_MEMERR(771),
        LD_MODELERR(772),
        LD_MODELPATHERR(773),
        LD_NULLPTRERR(774),
        LD_TRACKERERR(775),
        BEST_FRAME_UNAVAILABLE(1281),
        SECOND_FRAME_UNAVAILABLE(1282),
        PARSE_INVALID_JPEG(32),
        PARSE_UNKNOWN_BYTEALIGN(33),
        PARSE_ABSENT_DATA(34),
        PARSE_CORRUPT_DATA(35),
        PARSE_UNKNOWN(36),
        JSS_VALID(100),
        JSS_INVALIDCOM(101),
        JSS_INVALIDKEY(102),
        JSS_INVALIDSTEG(104);
        
        private final int value;

        private ErrorCode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum FacePose {
        LEFT(0),
        RIGHT(1),
        UP(2),
        DOWN(3),
        CENTER(4),
        UNKNOWN(5);
        
        private final int value;

        private FacePose(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public static final class ImageWriter {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String execute(String str, String str2, String str3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                try {
                    ExifInterface exifInterface = new ExifInterface(str);
                    exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, "1");
                    exifInterface.setAttribute(ExifInterface.TAG_USER_COMMENT, str2);
                    exifInterface.setAttribute(ExifInterface.TAG_IMAGE_DESCRIPTION, str3);
                    exifInterface.saveAttributes();
                    return "Written successfully.";
                } catch (Exception e) {
                    return e.toString();
                }
            }
        }

        public static final String execute(String str, String str2, String str3) {
            return Companion.execute(str, str2, str3);
        }
    }

    public enum PixelFormat {
        NV21(0),
        RGBA(1),
        BGRA(2),
        NV12(3),
        YU12(4),
        I420(5);
        
        private final int value;

        private PixelFormat(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum Rotation {
        ROTATION_0(0),
        ROTATION_270(3),
        ROTATION_MIRRORED_90(5),
        ROTATION_MIRRORED_270(7);
        
        private final int value;

        private Rotation(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public enum Status {
        NO_ISSUE(0),
        PASS(1),
        UNKNOWN(256),
        LIVENESS_FAILED(InputDeviceCompat.SOURCE_KEYBOARD),
        FRAUD(258),
        EYE_BLINK_FAILED(259),
        AURORA_RETRIES_FAILED(260),
        TIME_EXPIRED_NO_FACE(261),
        TIME_EXPIRED_NO_CARD(262),
        TIME_EXPIRED_MULTIPLE_FACE(Optimizer.OPTIMIZATION_STANDARD),
        TIME_EXPIRED_TOO_NEAR(264),
        TIME_EXPIRED_TOO_FAR(265),
        TIME_EXPIRED_CROPPED(266),
        TIME_EXPIRED_BLOCKED(267),
        TIME_EXPIRED_LOWLIGHT(268),
        TIME_EXPIRED_HIGHLIGHT(269),
        TIME_EXPIRED_BACKLIGHT(270),
        TIME_EXPIRED_LIGHTING(271),
        TIME_EXPIRED_BLUR(272),
        TIME_EXPIRED_OTHERS(273),
        LOAD_MODEL_FAILED(274),
        TIME_EXPIRED_DAMAGED(275),
        FACE_NOT_DETECTED(512),
        CARD_NOT_DETECTED(InputDeviceCompat.SOURCE_DPAD),
        FACE_DROPPED(514),
        MULTIPLE_FACES(515),
        TOO_NEAR(768),
        TOO_FAR(769),
        CROPPED(770),
        BLOCKED(771),
        LOWLIGHT(772),
        HIGHLIGHT(773),
        BACKLIGHT(774),
        FIX_LIGHTING(775),
        BLUR(776),
        MOTION_DETECTED(777),
        ROTATION_DETECTED(778),
        DAMAGED(779),
        AURORA_FLASHING(1024),
        AURORA_INFERENCE(InputDeviceCompat.SOURCE_GAMEPAD),
        AURORA_RESTART(1026),
        EYES_CLOSED(PlatformPlugin.DEFAULT_SYSTEM_UI),
        EYES_BLOCKED(1281),
        BLINK_EYES(1282),
        CAPTURE_WINDOW_STARTED(1537);
        
        private final int value;

        private Status(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    static {
        System.loadLibrary("ad2");
    }

    public static final native ErrorCode createInstance(CardType cardType, int i, Rotation rotation, int i2, String str, Context context, String str2);

    public static final native ErrorCode destroyInstance();

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult);
    }

    public static final native ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str);

    public static final native ErrorCode detectFaceByteArray(byte[] bArr, int i, int i2, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2, String str);

    public static final native String encrypt(String str);

    public static final native String getAuroraZipName();

    public static final native String getOjoLogFileName();

    public static final native String getVersion();

    public static final native String runBenchmark(byte[] bArr, int i, int i2, String str, int i3, int i4);

    public static final native ErrorCode saveBestFrame(String str, String str2, String str3, int i, boolean z);

    public static final native ErrorCode saveSecondFrame(String str, String str2, String str3, int i, boolean z);

    public static final ErrorCode setKtpThresholds() {
        return Companion.setKtpThresholds();
    }

    public static final native ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3, int i4, int i5);

    public static final native ErrorCode setModelParameters(AssetManager assetManager, int i, boolean z);

    public static final native ErrorCode setModelParameters(String str, int i, boolean z);

    public static final native int setNumFrames(int i);

    public static final native ErrorCode setROIPercentage(Rect rect, int i, int i2);

    public static final ErrorCode setSelfieThresholds() {
        return Companion.setSelfieThresholds();
    }

    public static final native ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10, int i11, float f26);

    public static final ErrorCode setWeights() {
        return Companion.setWeights();
    }

    public static final native ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17, float f18, float f19);

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z);
    }

    public static final ErrorCode setKtpThresholds(float f) {
        return Companion.setKtpThresholds(f);
    }

    public static final ErrorCode setSelfieThresholds(float f) {
        return Companion.setSelfieThresholds(f);
    }

    public static final ErrorCode setWeights(float f) {
        return Companion.setWeights(f);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2) {
        return Companion.setKtpThresholds(f, f2);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z) {
        return Companion.setSelfieThresholds(f, z);
    }

    public static final ErrorCode setWeights(float f, float f2) {
        return Companion.setWeights(f, f2);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3) {
        return Companion.setKtpThresholds(f, f2, f3);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i) {
        return Companion.setSelfieThresholds(f, z, i);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3) {
        return Companion.setWeights(f, f2, f3);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4) {
        return Companion.setKtpThresholds(f, f2, f3, f4);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2) {
        return Companion.setSelfieThresholds(f, z, i, i2);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4) {
        return Companion.setWeights(f, f2, f3, f4);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5) {
        return Companion.setWeights(f, f2, f3, f4, f5);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, j);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8);
    }

    public static final ErrorCode detectFace(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, PixelFormat pixelFormat, DetectionResult detectionResult, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j, long j2) {
        return Companion.detectFace(bArr, bArr2, bArr3, i, i2, i3, i4, i5, i6, i7, i8, pixelFormat, detectionResult, z, z2, z3, z4, z5, z6, z7, j, j2);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11, i3);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i);
    }

    public static final ErrorCode setKtpThresholds(float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, float f7, float f8, float f9, float f10, float f11, int i3, int i4) {
        return Companion.setKtpThresholds(f, f2, f3, f4, f5, i, i2, f6, f7, f8, f9, f10, f11, i3, i4);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16, f17);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3);
    }

    public static final ErrorCode setWeights(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i, int i2, float f14, float f15, float f16, float f17, float f18) {
        return Companion.setWeights(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, i, i2, f14, f15, f16, f17, f18);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9, i10);
    }

    public static final ErrorCode setSelfieThresholds(float f, boolean z, int i, int i2, int i3, long j, int i4, float f2, long j2, int i5, long j3, long j4, float f3, float f4, float f5, float f6, float f7, boolean z2, float f8, boolean z3, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z4, float f17, float f18, int i6, int i7, float f19, float f20, float f21, float f22, float f23, float f24, float f25, int i8, int i9, int i10, int i11) {
        return Companion.setSelfieThresholds(f, z, i, i2, i3, j, i4, f2, j2, i5, j3, j4, f3, f4, f5, f6, f7, z2, f8, z3, f9, f10, f11, f12, f13, f14, f15, f16, z4, f17, f18, i6, i7, f19, f20, f21, f22, f23, f24, f25, i8, i9, i10, i11);
    }

    public static final class Face {
        private Rect boundingBox;
        private int confidenceScore;
        private boolean isCropped;
        private Landmark landmark;

        public Face(Rect rect, Landmark landmark2, int i, boolean z) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(landmark2, "");
            this.boundingBox = rect;
            this.landmark = landmark2;
            this.confidenceScore = i;
            this.isCropped = z;
        }

        public final Rect getBoundingBox() {
            return this.boundingBox;
        }

        public final int getConfidenceScore() {
            return this.confidenceScore;
        }

        public final Landmark getLandmark() {
            return this.landmark;
        }

        public final boolean isCropped() {
            return this.isCropped;
        }

        public final void setBoundingBox(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "");
            this.boundingBox = rect;
        }

        public final void setConfidenceScore(int i) {
            this.confidenceScore = i;
        }

        public final void setCropped(boolean z) {
            this.isCropped = z;
        }

        public final void setLandmark(Landmark landmark2) {
            Intrinsics.checkNotNullParameter(landmark2, "");
            this.landmark = landmark2;
        }

        public final HashMap<String, Object> toHashMap() {
            Pair[] pairArr = {new Pair("boundingBoxLeft", Integer.valueOf(this.boundingBox.left)), new Pair("boundingBoxTop", Integer.valueOf(this.boundingBox.top)), new Pair("boundingBoxRight", Integer.valueOf(this.boundingBox.right)), new Pair("boundingBoxBottom", Integer.valueOf(this.boundingBox.bottom)), new Pair("landmark", this.landmark.toHashMap()), new Pair("confidenceScore", Integer.valueOf(this.confidenceScore)), new Pair("isCropped", Boolean.valueOf(this.isCropped))};
            Intrinsics.checkNotNullParameter(pairArr, "");
            HashMap<String, Object> hashMap = new HashMap<>(updateNavigationIcon.RemoteActionCompatParcelizer(7));
            updateNavigationIcon.asInterface(hashMap, pairArr);
            return hashMap;
        }
    }

    public static final class Landmark {
        private final Point LEFT_EYE;
        private final Point MOUTH_LEFT;
        private final Point MOUTH_RIGHT;
        private final Point NOSE;
        private final Point RIGHT_EYE;

        public Landmark(Point point, Point point2, Point point3, Point point4, Point point5) {
            Intrinsics.checkNotNullParameter(point, "");
            Intrinsics.checkNotNullParameter(point2, "");
            Intrinsics.checkNotNullParameter(point3, "");
            Intrinsics.checkNotNullParameter(point4, "");
            Intrinsics.checkNotNullParameter(point5, "");
            this.LEFT_EYE = point;
            this.RIGHT_EYE = point2;
            this.NOSE = point3;
            this.MOUTH_LEFT = point4;
            this.MOUTH_RIGHT = point5;
        }

        public final Point getLEFT_EYE() {
            return this.LEFT_EYE;
        }

        public final Point getMOUTH_LEFT() {
            return this.MOUTH_LEFT;
        }

        public final Point getMOUTH_RIGHT() {
            return this.MOUTH_RIGHT;
        }

        public final Point getNOSE() {
            return this.NOSE;
        }

        public final Point getRIGHT_EYE() {
            return this.RIGHT_EYE;
        }

        public final HashMap<String, Integer> toHashMap() {
            Pair[] pairArr = {new Pair("LEFT_EYE_X", Integer.valueOf(this.LEFT_EYE.x)), new Pair("LEFT_EYE_Y", Integer.valueOf(this.LEFT_EYE.y)), new Pair("RIGHT_EYE_X", Integer.valueOf(this.RIGHT_EYE.x)), new Pair("RIGHT_EYE_Y", Integer.valueOf(this.RIGHT_EYE.y)), new Pair("NOSE_X", Integer.valueOf(this.NOSE.x)), new Pair("NOSE_Y", Integer.valueOf(this.NOSE.y)), new Pair("MOUTH_LEFT_X", Integer.valueOf(this.MOUTH_LEFT.x)), new Pair("MOUTH_LEFT_Y", Integer.valueOf(this.MOUTH_LEFT.y)), new Pair("MOUTH_RIGHT_X", Integer.valueOf(this.MOUTH_RIGHT.x)), new Pair("MOUTH_RIGHT_Y", Integer.valueOf(this.MOUTH_RIGHT.y))};
            Intrinsics.checkNotNullParameter(pairArr, "");
            HashMap<String, Integer> hashMap = new HashMap<>(updateNavigationIcon.RemoteActionCompatParcelizer(10));
            updateNavigationIcon.asInterface(hashMap, pairArr);
            return hashMap;
        }
    }

    public static final class Object {
        private Rect boundingBox;
        private int confidenceScore;
        private boolean isCropped;
        private boolean isCroppedRaw;
        private String label;

        public Object(Rect rect, String str, int i, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.boundingBox = rect;
            this.label = str;
            this.confidenceScore = i;
            this.isCropped = z;
            this.isCroppedRaw = z2;
        }

        public final Rect getBoundingBox() {
            return this.boundingBox;
        }

        public final int getConfidenceScore() {
            return this.confidenceScore;
        }

        public final String getLabel() {
            return this.label;
        }

        public final boolean isCropped() {
            return this.isCropped;
        }

        public final boolean isCroppedRaw() {
            return this.isCroppedRaw;
        }

        public final void setBoundingBox(Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "");
            this.boundingBox = rect;
        }

        public final void setConfidenceScore(int i) {
            this.confidenceScore = i;
        }

        public final void setCropped(boolean z) {
            this.isCropped = z;
        }

        public final void setCroppedRaw(boolean z) {
            this.isCroppedRaw = z;
        }

        public final void setLabel(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.label = str;
        }

        public final HashMap<String, Object> toHashMap() {
            Pair[] pairArr = {new Pair("boundingBoxLeft", Integer.valueOf(this.boundingBox.left)), new Pair("boundingBoxTop", Integer.valueOf(this.boundingBox.top)), new Pair("boundingBoxRight", Integer.valueOf(this.boundingBox.right)), new Pair("boundingBoxBottom", Integer.valueOf(this.boundingBox.bottom)), new Pair("label", this.label), new Pair("confidenceScore", Integer.valueOf(this.confidenceScore)), new Pair("isCropped", Boolean.valueOf(this.isCropped)), new Pair("isCroppedRaw", Boolean.valueOf(this.isCroppedRaw))};
            Intrinsics.checkNotNullParameter(pairArr, "");
            HashMap<String, Object> hashMap = new HashMap<>(updateNavigationIcon.RemoteActionCompatParcelizer(8));
            updateNavigationIcon.asInterface(hashMap, pairArr);
            return hashMap;
        }
    }
}
