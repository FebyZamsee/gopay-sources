package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import o.setSupportActionBar;
import o.shouldCenterSingleButton;

public class PlaybackException extends Exception implements shouldCenterSingleButton {
    private static final String AudioAttributesCompatParcelizer = Integer.toString(2, 36);
    private static final String RemoteActionCompatParcelizer = Integer.toString(3, 36);
    private static final String asBinder = Integer.toString(0, 36);
    private static final String asInterface = Integer.toString(1, 36);
    private static final String read = Integer.toString(4, 36);
    public final int onTransact;
    public final long write;

    public PlaybackException(Bundle bundle) {
        this(bundle.getString(AudioAttributesCompatParcelizer), RemoteActionCompatParcelizer(bundle), bundle.getInt(asBinder, 1000), bundle.getLong(asInterface, SystemClock.elapsedRealtime()));
    }

    protected PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.onTransact = i;
        this.write = j;
    }

    public Bundle asBinder() {
        Bundle bundle = new Bundle();
        bundle.putInt(asBinder, this.onTransact);
        bundle.putLong(asInterface, this.write);
        bundle.putString(AudioAttributesCompatParcelizer, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(RemoteActionCompatParcelizer, cause.getClass().getName());
            bundle.putString(read, cause.getMessage());
        }
        return bundle;
    }

    private static Throwable RemoteActionCompatParcelizer(Bundle bundle) {
        String string = bundle.getString(RemoteActionCompatParcelizer);
        String string2 = bundle.getString(read);
        Throwable th = null;
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, PlaybackException.class.getClassLoader());
            if (Throwable.class.isAssignableFrom(cls)) {
                th = (Throwable) cls.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string2});
            }
            if (th != null) {
                return th;
            }
        } catch (Throwable unused) {
        }
        return new RemoteException(string2);
    }

    static {
        new setSupportActionBar
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: CONSTRUCTOR  (r0v2 ? I:o.setSupportActionBar) =  call: o.setSupportActionBar.<init>():void type: CONSTRUCTOR in method: com.google.android.exoplayer2.PlaybackException.<clinit>():void, dex: classes.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v2 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            r0 = 36
            r1 = 0
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            asBinder = r1
            r1 = 1
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            asInterface = r1
            r1 = 2
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            AudioAttributesCompatParcelizer = r1
            r1 = 3
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            RemoteActionCompatParcelizer = r1
            r1 = 4
            java.lang.String r0 = java.lang.Integer.toString(r1, r0)
            read = r0
            o.setSupportActionBar r0 = new o.setSupportActionBar
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.PlaybackException.<clinit>():void");
    }
}
