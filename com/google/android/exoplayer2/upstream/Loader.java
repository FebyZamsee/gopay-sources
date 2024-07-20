package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.OnBackPressedDispatcher;
import o.bindItemView;
import o.findMenuItemForSubmenu;
import o.setHorizontalOffset;

public final class Loader implements bindItemView {
    public static final RemoteActionCompatParcelizer asBinder = new RemoteActionCompatParcelizer(2, -9223372036854775807L, (byte) 0);
    public static final RemoteActionCompatParcelizer asInterface = new RemoteActionCompatParcelizer(0, -9223372036854775807L, (byte) 0);
    public static final RemoteActionCompatParcelizer onTransact = new RemoteActionCompatParcelizer(3, -9223372036854775807L, (byte) 0);
    public IOException IconCompatParcelizer;
    public asBinder<? extends asInterface> RemoteActionCompatParcelizer;
    final ExecutorService read;

    public interface asInterface {
        void asBinder();

        void j_() throws IOException;
    }

    public interface onTransact {
        void AudioAttributesImplApi26Parcelizer();
    }

    public interface read<T extends asInterface> {
        void onTransact(T t, long j, long j2);

        void onTransact(T t, long j, long j2, boolean z);

        RemoteActionCompatParcelizer read(T t, long j, long j2, IOException iOException, int i);
    }

    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedLoaderException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unexpected "
                r0.<init>(r1)
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = ": "
                r0.append(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    public static final class RemoteActionCompatParcelizer {
        public final int asInterface;
        final long read;

        public /* synthetic */ RemoteActionCompatParcelizer(int i, long j, byte b) {
            this(i, j);
        }

        private RemoteActionCompatParcelizer(int i, long j) {
            this.asInterface = i;
            this.read = j;
        }
    }

    public Loader(String str) {
        StringBuilder sb = new StringBuilder("ExoPlayer:Loader:");
        sb.append(str);
        this.read = Executors.newSingleThreadExecutor(new setHorizontalOffset(sb.toString()));
    }

    public final <T extends asInterface> long onTransact(T t, read<T> read2, int i) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.IconCompatParcelizer = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            new asBinder(myLooper, t, read2, i, elapsedRealtime).asBinder(0);
            return elapsedRealtime;
        }
        throw new IllegalStateException();
    }

    public final void asBinder(onTransact ontransact) {
        asBinder<? extends asInterface> asbinder = this.RemoteActionCompatParcelizer;
        if (asbinder != null) {
            asbinder.asBinder(true);
        }
        if (ontransact != null) {
            this.read.execute(new write(ontransact));
        }
        this.read.shutdown();
    }

    public final void setInternalConnectionCallback() throws IOException {
        RemoteActionCompatParcelizer(Integer.MIN_VALUE);
    }

    public final void RemoteActionCompatParcelizer(int i) throws IOException {
        IOException iOException = this.IconCompatParcelizer;
        if (iOException == null) {
            asBinder<? extends asInterface> asbinder = this.RemoteActionCompatParcelizer;
            if (asbinder != null) {
                if (i == Integer.MIN_VALUE) {
                    i = asbinder.onTransact;
                }
                IOException iOException2 = asbinder.asBinder;
                if (iOException2 != null && asbinder.asInterface > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final class asBinder<T extends asInterface> extends Handler implements Runnable {
        private volatile boolean AudioAttributesImplApi21Parcelizer;
        private final T AudioAttributesImplApi26Parcelizer;
        private final long IconCompatParcelizer;
        private read<T> RemoteActionCompatParcelizer;
        IOException asBinder;
        int asInterface;
        public final int onTransact;
        private boolean read;
        private Thread write;

        public asBinder(Looper looper, T t, read<T> read2, int i, long j) {
            super(looper);
            this.AudioAttributesImplApi26Parcelizer = t;
            this.RemoteActionCompatParcelizer = read2;
            this.onTransact = i;
            this.IconCompatParcelizer = j;
        }

        public final void asBinder(long j) {
            if (Loader.this.RemoteActionCompatParcelizer == null) {
                Loader.this.RemoteActionCompatParcelizer = this;
                if (j > 0) {
                    sendEmptyMessageDelayed(0, j);
                    return;
                }
                this.asBinder = null;
                Loader.this.read.execute(Loader.this.RemoteActionCompatParcelizer);
                return;
            }
            throw new IllegalStateException();
        }

        public final void asBinder(boolean z) {
            this.AudioAttributesImplApi21Parcelizer = z;
            this.asBinder = null;
            if (hasMessages(0)) {
                this.read = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.read = true;
                    this.AudioAttributesImplApi26Parcelizer.asBinder();
                    Thread thread = this.write;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                Loader.this.RemoteActionCompatParcelizer = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.RemoteActionCompatParcelizer.onTransact(this.AudioAttributesImplApi26Parcelizer, elapsedRealtime, elapsedRealtime - this.IconCompatParcelizer, true);
                this.RemoteActionCompatParcelizer = null;
            }
        }

        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = !this.read;
                    this.write = Thread.currentThread();
                }
                if (z) {
                    StringBuilder sb = new StringBuilder("load:");
                    sb.append(this.AudioAttributesImplApi26Parcelizer.getClass().getSimpleName());
                    String obj = sb.toString();
                    if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                        Trace.beginSection(obj);
                    }
                    this.AudioAttributesImplApi26Parcelizer.j_();
                    if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                        Trace.endSection();
                    }
                }
                synchronized (this) {
                    this.write = null;
                    Thread.interrupted();
                }
                if (!this.AudioAttributesImplApi21Parcelizer) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.AudioAttributesImplApi21Parcelizer) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.AudioAttributesImplApi21Parcelizer) {
                    findMenuItemForSubmenu.onTransact("Unexpected exception loading stream", e2);
                    synchronized (findMenuItemForSubmenu.read) {
                        obtainMessage(2, new UnexpectedLoaderException(e2)).sendToTarget();
                    }
                }
            } catch (OutOfMemoryError e3) {
                if (!this.AudioAttributesImplApi21Parcelizer) {
                    findMenuItemForSubmenu.onTransact("OutOfMemory error loading stream", e3);
                    synchronized (findMenuItemForSubmenu.read) {
                        obtainMessage(2, new UnexpectedLoaderException(e3)).sendToTarget();
                    }
                }
            } catch (Error e4) {
                if (!this.AudioAttributesImplApi21Parcelizer) {
                    findMenuItemForSubmenu.onTransact("Unexpected error loading stream", e4);
                    synchronized (findMenuItemForSubmenu.read) {
                        obtainMessage(3, e4).sendToTarget();
                    }
                }
                throw e4;
            } catch (Throwable th) {
                if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                    Trace.endSection();
                }
                throw th;
            }
        }

        public final void handleMessage(Message message) {
            long j;
            if (!this.AudioAttributesImplApi21Parcelizer) {
                if (message.what == 0) {
                    this.asBinder = null;
                    Loader.this.read.execute(Loader.this.RemoteActionCompatParcelizer);
                } else if (message.what != 3) {
                    Loader.this.RemoteActionCompatParcelizer = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.IconCompatParcelizer;
                    read read2 = this.RemoteActionCompatParcelizer;
                    if (this.read) {
                        read2.onTransact(this.AudioAttributesImplApi26Parcelizer, elapsedRealtime, j2, false);
                        return;
                    }
                    int i = message.what;
                    if (i == 1) {
                        try {
                            read2.onTransact(this.AudioAttributesImplApi26Parcelizer, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            findMenuItemForSubmenu.onTransact("Unexpected exception handling load completed", e);
                            synchronized (findMenuItemForSubmenu.read) {
                                Loader.this.IconCompatParcelizer = new UnexpectedLoaderException(e);
                            }
                        }
                    } else if (i == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.asBinder = iOException;
                        int i2 = this.asInterface + 1;
                        this.asInterface = i2;
                        RemoteActionCompatParcelizer read3 = read2.read(this.AudioAttributesImplApi26Parcelizer, elapsedRealtime, j2, iOException, i2);
                        if (read3.asInterface == 3) {
                            Loader.this.IconCompatParcelizer = this.asBinder;
                        } else if (read3.asInterface != 2) {
                            if (read3.asInterface == 1) {
                                this.asInterface = 1;
                            }
                            if (read3.read != -9223372036854775807L) {
                                j = read3.read;
                            } else {
                                j = (long) Math.min((this.asInterface - 1) * 1000, 5000);
                            }
                            asBinder(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }
    }

    static final class write implements Runnable {
        private final onTransact asInterface;

        public write(onTransact ontransact) {
            this.asInterface = ontransact;
        }

        public final void run() {
            this.asInterface.AudioAttributesImplApi26Parcelizer();
        }
    }

    static {
        new RemoteActionCompatParcelizer(1, -9223372036854775807L, (byte) 0);
    }
}
