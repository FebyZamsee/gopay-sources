package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.createItemView;
import o.setExpandedFormat;
import o.setOnBackInvokedDispatcher;
import o.showsIcon;

public interface HttpDataSource extends setExpandedFormat {

    public static final class asBinder {
        public final Map<String, String> RemoteActionCompatParcelizer = new HashMap();
        public Map<String, String> read;

        public final Map<String, String> read() {
            Map<String, String> map;
            synchronized (this) {
                if (this.read == null) {
                    this.read = Collections.unmodifiableMap(new HashMap(this.RemoteActionCompatParcelizer));
                }
                map = this.read;
            }
            return map;
        }
    }

    static {
        new createItemView
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:o.createItemView) =  call: o.createItemView.<init>():void type: CONSTRUCTOR in method: com.google.android.exoplayer2.upstream.HttpDataSource.<clinit>():void, dex: classes.dex
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
            o.createItemView r0 = new o.createItemView
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.<clinit>():void");
    }

    public static class HttpDataSourceException extends DataSourceException {
        private showsIcon asInterface;
        public final int read;

        public static HttpDataSourceException asBinder(IOException iOException, showsIcon showsicon, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !setOnBackInvokedDispatcher.AudioAttributesImplApi21Parcelizer(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new CleartextNotPermittedException(iOException, showsicon);
            }
            return new HttpDataSourceException(iOException, showsicon, i2, i);
        }

        public HttpDataSourceException(showsIcon showsicon) {
            super(2008);
            this.asInterface = showsicon;
            this.read = 1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HttpDataSourceException(String str, showsIcon showsicon, int i) {
            super(str, i == 2000 ? 2001 : i);
            this.asInterface = showsicon;
            this.read = 1;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public HttpDataSourceException(java.io.IOException r2, o.showsIcon r3, int r4, int r5) {
            /*
                r1 = this;
                r0 = 2000(0x7d0, float:2.803E-42)
                if (r4 != r0) goto L_0x0009
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r4 = 2001(0x7d1, float:2.804E-42)
            L_0x0009:
                r1.<init>((java.lang.Throwable) r2, (int) r4)
                r1.asInterface = r3
                r1.read = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.<init>(java.io.IOException, o.showsIcon, int, int):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HttpDataSourceException(String str, IOException iOException, showsIcon showsicon, int i) {
            super(str, iOException, i == 2000 ? 2001 : i);
            this.asInterface = showsicon;
            this.read = 1;
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, showsIcon showsicon) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, showsicon, 2007);
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        private String RemoteActionCompatParcelizer;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InvalidContentTypeException(java.lang.String r3, o.showsIcon r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Invalid content type: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r1 = 2003(0x7d3, float:2.807E-42)
                r2.<init>(r0, r4, r1)
                r2.RemoteActionCompatParcelizer = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException.<init>(java.lang.String, o.showsIcon):void");
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        private String IconCompatParcelizer;
        public final Map<String, List<String>> RemoteActionCompatParcelizer;
        public final int asInterface;
        private byte[] onTransact;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InvalidResponseCodeException(int r3, java.lang.String r4, java.io.IOException r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6, o.showsIcon r7, byte[] r8) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Response code: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r1 = 2004(0x7d4, float:2.808E-42)
                r2.<init>((java.lang.String) r0, (java.io.IOException) r5, (o.showsIcon) r7, (int) r1)
                r2.asInterface = r3
                r2.IconCompatParcelizer = r4
                r2.RemoteActionCompatParcelizer = r6
                r2.onTransact = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException.<init>(int, java.lang.String, java.io.IOException, java.util.Map, o.showsIcon, byte[]):void");
        }
    }
}
