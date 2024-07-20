package com.pichillilorenzo.flutter_inappwebview.print_job;

import android.print.PrintJob;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview.types.PrintJobInfoExt;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

public class PrintJobController implements Disposable {
    protected static final String LOG_TAG = "PrintJob";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_printjobcontroller_";
    public PrintJobChannelDelegate channelDelegate;
    public String id;
    public PrintJob job;
    public InAppWebViewFlutterPlugin plugin;
    public PrintJobSettings settings;

    public PrintJobController(String str, PrintJob printJob, PrintJobSettings printJobSettings, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.id = str;
        this.plugin = inAppWebViewFlutterPlugin;
        this.job = printJob;
        this.settings = printJobSettings;
        BinaryMessenger binaryMessenger = inAppWebViewFlutterPlugin.messenger;
        StringBuilder sb = new StringBuilder(METHOD_CHANNEL_NAME_PREFIX);
        sb.append(str);
        this.channelDelegate = new PrintJobChannelDelegate(this, new MethodChannel(binaryMessenger, sb.toString()));
    }

    public void cancel() {
        PrintJob printJob = this.job;
        if (printJob != null) {
            printJob.cancel();
        }
    }

    public void restart() {
        PrintJob printJob = this.job;
        if (printJob != null) {
            printJob.restart();
        }
    }

    public PrintJobInfoExt getInfo() {
        PrintJob printJob = this.job;
        if (printJob != null) {
            return PrintJobInfoExt.fromPrintJobInfo(printJob.getInfo());
        }
        return null;
    }

    public void disposeNoCancel() {
        PrintJobManager printJobManager;
        PrintJobChannelDelegate printJobChannelDelegate = this.channelDelegate;
        if (printJobChannelDelegate != null) {
            printJobChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (!(inAppWebViewFlutterPlugin == null || (printJobManager = inAppWebViewFlutterPlugin.printJobManager) == null || !printJobManager.jobs.containsKey(this.id))) {
            printJobManager.jobs.put(this.id, (Object) null);
        }
        if (this.job != null) {
            this.job = null;
        }
        this.plugin = null;
    }

    public void dispose() {
        PrintJobManager printJobManager;
        PrintJobChannelDelegate printJobChannelDelegate = this.channelDelegate;
        if (printJobChannelDelegate != null) {
            printJobChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (!(inAppWebViewFlutterPlugin == null || (printJobManager = inAppWebViewFlutterPlugin.printJobManager) == null || !printJobManager.jobs.containsKey(this.id))) {
            printJobManager.jobs.put(this.id, (Object) null);
        }
        PrintJob printJob = this.job;
        if (printJob != null) {
            printJob.cancel();
            this.job = null;
        }
        this.plugin = null;
    }
}
