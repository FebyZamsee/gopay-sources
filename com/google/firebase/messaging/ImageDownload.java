package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ImageDownload implements Closeable {
    private volatile Future<?> future;
    private Task<Bitmap> task;
    private final URL url;

    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private ImageDownload(URL url2) {
        this.url = url2;
    }

    public void start(ExecutorService executorService) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.future = executorService.submit(new ImageDownload$$ExternalSyntheticLambda0(this, taskCompletionSource));
        this.task = taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$start$0$com-google-firebase-messaging-ImageDownload  reason: not valid java name */
    public /* synthetic */ void m119lambda$start$0$comgooglefirebasemessagingImageDownload(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingDownload());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.task);
    }

    public Bitmap blockingDownload() throws IOException {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        byte[] blockingDownloadBytes = blockingDownloadBytes();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blockingDownloadBytes, 0, blockingDownloadBytes.length);
        if (decodeByteArray != null) {
            boolean isLoggable2 = Log.isLoggable("FirebaseMessaging", 3);
            return decodeByteArray;
        }
        StringBuilder sb = new StringBuilder("Failed to decode image: ");
        sb.append(this.url);
        throw new IOException(sb.toString());
    }

    private byte[] blockingDownloadBytes() throws IOException {
        URLConnection openConnection = this.url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = byteArray.length;
                }
                if (byteArray.length <= 1048576) {
                    return byteArray;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public void close() {
        this.future.cancel(true);
    }
}
