package com.appsflyer.internal;

import com.appsflyer.AFLogger;

public final class AFe1oSDK implements AFd1nSDK {
    private final AFe1mSDK AFInAppEventParameterName;
    public final AFe1kSDK AFInAppEventType;
    private final AFc1vSDK AFKeystoreWrapper;
    private final AFd1mSDK AFLogger;
    private final AFe1lSDK afDebugLog;
    private AFe1rSDK afErrorLog;
    private AFf1eSDK afInfoLog;
    private final AFc1hSDK afRDLog;
    private final Object valueOf = new Object();
    private final AFe1hSDK values;

    public final void AFInAppEventParameterName(AFd1jSDK<?> aFd1jSDK) {
    }

    public AFe1oSDK(AFe1mSDK aFe1mSDK, AFc1vSDK aFc1vSDK, AFe1hSDK aFe1hSDK, AFe1kSDK aFe1kSDK, AFc1hSDK aFc1hSDK, AFe1lSDK aFe1lSDK, AFd1mSDK aFd1mSDK) {
        this.AFInAppEventParameterName = aFe1mSDK;
        this.AFKeystoreWrapper = aFc1vSDK;
        this.values = aFe1hSDK;
        this.AFInAppEventType = aFe1kSDK;
        this.afRDLog = aFc1hSDK;
        this.afDebugLog = aFe1lSDK;
        this.AFLogger = aFd1mSDK;
        aFd1mSDK.valueOf.add(this);
    }

    public final void values(AFe1qSDK aFe1qSDK) {
        AFe1pSDK aFe1pSDK = new AFe1pSDK(this.AFInAppEventParameterName, this.AFKeystoreWrapper, this.values, this.AFInAppEventType, this.afRDLog, this.afDebugLog, "v1", aFe1qSDK);
        AFd1mSDK aFd1mSDK = this.AFLogger;
        aFd1mSDK.AFKeystoreWrapper.execute(new Runnable(aFe1pSDK) {
            private /* synthetic */ AFd1jSDK AFInAppEventType;

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
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
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
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
            
*/
        });
    }

    public final AFf1eSDK AFInAppEventParameterName() {
        AFf1eSDK aFf1eSDK;
        synchronized (this.valueOf) {
            aFf1eSDK = this.afInfoLog;
            this.afInfoLog = null;
        }
        return aFf1eSDK;
    }

    private void valueOf(AFe1rSDK aFe1rSDK, AFe1qSDK aFe1qSDK) {
        synchronized (this.valueOf) {
            this.afErrorLog = aFe1rSDK;
        }
        if (aFe1qSDK != null) {
            aFe1qSDK.onRemoteConfigUpdateFinished(aFe1rSDK);
        }
    }

    public final void AFInAppEventParameterName(AFd1jSDK<?> aFd1jSDK, AFd1sSDK aFd1sSDK) {
        if (aFd1jSDK instanceof AFe1pSDK) {
            AFe1pSDK aFe1pSDK = (AFe1pSDK) aFd1jSDK;
            AFe1rSDK aFe1rSDK = aFe1pSDK.afErrorLog;
            if (aFe1rSDK == null) {
                AFLogger.afWarnLog("CFG: update RC returned null result, something went wrong!");
                aFe1rSDK = AFe1rSDK.FAILURE;
            }
            if (aFe1rSDK != AFe1rSDK.USE_CACHED) {
                AFf1eSDK aFf1eSDK = aFe1pSDK.afDebugLog;
                synchronized (this.valueOf) {
                    this.afInfoLog = aFf1eSDK;
                }
            }
            valueOf(aFe1rSDK, aFe1pSDK.AFLogger);
        }
    }

    public final void AFInAppEventType(AFd1jSDK<?> aFd1jSDK) {
        if (aFd1jSDK instanceof AFe1pSDK) {
            AFe1pSDK aFe1pSDK = (AFe1pSDK) aFd1jSDK;
            synchronized (this.valueOf) {
                this.afInfoLog = null;
            }
            valueOf(AFe1rSDK.FAILURE, aFe1pSDK.AFLogger);
        }
    }
}
