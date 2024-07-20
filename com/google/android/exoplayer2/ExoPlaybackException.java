package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.location.GeofenceStatusCodes;
import o.onKeyUp;
import o.setDither;
import o.setMultiChoiceItems;

public final class ExoPlaybackException extends PlaybackException {
    private static final String AudioAttributesCompatParcelizer = Integer.toString(1004, 36);
    private static final String AudioAttributesImplApi21Parcelizer = Integer.toString(PointerIconCompat.TYPE_CELL, 36);
    private static final String AudioAttributesImplApi26Parcelizer = Integer.toString(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 36);
    private static final String IconCompatParcelizer = Integer.toString(PointerIconCompat.TYPE_HELP, 36);
    private static final String onConnected = Integer.toString(1001, 36);
    private static final String onConnectionFailed = Integer.toString(1002, 36);
    private String AudioAttributesImplBaseParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final boolean asBinder;
    public final int asInterface;
    private int onConnectionSuspended;
    public final setDither read;
    private setMultiChoiceItems setInternalConnectionCallback;

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, (String) null, i2, (String) null, -1, (setMultiChoiceItems) null, 4, false);
    }

    public ExoPlaybackException(Bundle bundle) {
        super(bundle);
        setMultiChoiceItems setmultichoiceitems;
        this.RemoteActionCompatParcelizer = bundle.getInt(onConnected, 2);
        this.AudioAttributesImplBaseParcelizer = bundle.getString(onConnectionFailed);
        this.onConnectionSuspended = bundle.getInt(IconCompatParcelizer, -1);
        Bundle bundle2 = bundle.getBundle(AudioAttributesCompatParcelizer);
        if (bundle2 == null) {
            setmultichoiceitems = null;
        } else {
            setmultichoiceitems = setMultiChoiceItems.asBinder.read(bundle2);
        }
        this.setInternalConnectionCallback = setmultichoiceitems;
        this.asInterface = bundle.getInt(AudioAttributesImplApi26Parcelizer, 4);
        this.asBinder = bundle.getBoolean(AudioAttributesImplApi21Parcelizer, false);
        this.read = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, setMultiChoiceItems setmultichoiceitems, int i4, setDither setdither, long j, boolean z) {
        super(str, th, i, j);
        int i5 = i2;
        boolean z2 = z;
        boolean z3 = false;
        if (!z2 || i5 == 1) {
            if ((th != null || i5 == 3) ? true : z3) {
                this.RemoteActionCompatParcelizer = i5;
                this.AudioAttributesImplBaseParcelizer = str2;
                this.onConnectionSuspended = i3;
                this.setInternalConnectionCallback = setmultichoiceitems;
                this.asInterface = i4;
                this.read = setdither;
                this.asBinder = z2;
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final ExoPlaybackException asBinder(setDither setdither) {
        return new ExoPlaybackException(getMessage(), getCause(), this.onTransact, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.onConnectionSuspended, this.setInternalConnectionCallback, this.asInterface, setdither, this.write, this.asBinder);
    }

    static {
        new onKeyUp
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:o.onKeyUp) =  call: o.onKeyUp.<init>():void type: CONSTRUCTOR in method: com.google.android.exoplayer2.ExoPlaybackException.<clinit>():void, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v0 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            o.onKeyUp r0 = new o.onKeyUp
            r0.<init>()
            r0 = 36
            r1 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            onConnected = r1
            r1 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            onConnectionFailed = r1
            r1 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            IconCompatParcelizer = r1
            r1 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            AudioAttributesCompatParcelizer = r1
            r1 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            AudioAttributesImplApi26Parcelizer = r1
            r1 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r0 = java.lang.Integer.toString(r1, r0)
            AudioAttributesImplApi21Parcelizer = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<clinit>():void");
    }

    public final Bundle asBinder() {
        Bundle asBinder2 = super.asBinder();
        asBinder2.putInt(onConnected, this.RemoteActionCompatParcelizer);
        asBinder2.putString(onConnectionFailed, this.AudioAttributesImplBaseParcelizer);
        asBinder2.putInt(IconCompatParcelizer, this.onConnectionSuspended);
        setMultiChoiceItems setmultichoiceitems = this.setInternalConnectionCallback;
        if (setmultichoiceitems != null) {
            asBinder2.putBundle(AudioAttributesCompatParcelizer, setmultichoiceitems.asBinder());
        }
        asBinder2.putInt(AudioAttributesImplApi26Parcelizer, this.asInterface);
        asBinder2.putBoolean(AudioAttributesImplApi21Parcelizer, this.asBinder);
        return asBinder2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, o.setMultiChoiceItems r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L_0x0062
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L_0x0017
            if (r4 == r0) goto L_0x000e
            java.lang.String r0 = "Unexpected runtime error"
            goto L_0x0010
        L_0x000e:
            java.lang.String r0 = "Remote error"
        L_0x0010:
            r5 = r18
            r6 = r19
            r7 = r20
            goto L_0x006a
        L_0x0017:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r20
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            if (r8 == 0) goto L_0x0058
            if (r8 == r1) goto L_0x0055
            r1 = 2
            if (r8 == r1) goto L_0x0052
            if (r8 == r0) goto L_0x004f
            r0 = 4
            if (r8 != r0) goto L_0x0049
            java.lang.String r0 = "YES"
            goto L_0x005a
        L_0x0049:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x004f:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x005a
        L_0x0052:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L_0x005a
        L_0x0055:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L_0x005a
        L_0x0058:
            java.lang.String r0 = "NO"
        L_0x005a:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x006a
        L_0x0062:
            r5 = r18
            r6 = r19
            r7 = r20
            java.lang.String r0 = "Source error"
        L_0x006a:
            boolean r1 = android.text.TextUtils.isEmpty(r16)
            if (r1 != 0) goto L_0x0086
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ": "
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0086:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r9 = 0
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, o.setMultiChoiceItems, int, boolean):void");
    }
}
