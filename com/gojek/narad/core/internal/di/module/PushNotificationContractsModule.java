package com.gojek.narad.core.internal.di.module;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.AppCompatDelegateImpl;
import o.ContentView;
import o.codename;
import o.message;

public final class PushNotificationContractsModule {
    public final ActivityResultContracts.StartIntentSenderForResult onTransact(ActivityResultContracts.TakeVideo takeVideo) {
        Intrinsics.checkNotNullParameter(takeVideo, "");
        return takeVideo.asInterface();
    }

    public final codename asInterface(ActivityResultContracts.StartIntentSenderForResult startIntentSenderForResult) {
        Intrinsics.checkNotNullParameter(startIntentSenderForResult, "");
        return new codename(startIntentSenderForResult) {
            private final ActivityResultContracts.StartIntentSenderForResult asInterface;

            public static boolean RemoteActionCompatParcelizer(AppCompatDelegateImpl.ContextThemeWrapperCompatApi17Impl contextThemeWrapperCompatApi17Impl) throws IOException {
                addMenu addmenu = new addMenu(8);
                RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.read(contextThemeWrapperCompatApi17Impl, addmenu);
                if (read.RemoteActionCompatParcelizer != 1380533830 && read.RemoteActionCompatParcelizer != 1380333108) {
                    return false;
                }
                contextThemeWrapperCompatApi17Impl.asInterface(addmenu.onTransact, 0, 4);
                if (addmenu.asInterface >= 0) {
                    addmenu.read = 0;
                    if (addmenu.read() == 1463899717) {
                        return true;
                    }
                    synchronized (findMenuItemForSubmenu.read) {
                    }
                    return false;
                }
                throw new IllegalArgumentException();
            }

            static RemoteActionCompatParcelizer onTransact(int i, AppCompatDelegateImpl.ContextThemeWrapperCompatApi17Impl contextThemeWrapperCompatApi17Impl, addMenu addmenu) throws IOException {
                RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.read(contextThemeWrapperCompatApi17Impl, addmenu);
                while (read.RemoteActionCompatParcelizer != i) {
                    int i2 = read.RemoteActionCompatParcelizer;
                    synchronized (findMenuItemForSubmenu.read) {
                    }
                    long j = read.asInterface + 8;
                    if (j <= 2147483647L) {
                        contextThemeWrapperCompatApi17Impl.read((int) j);
                        read = RemoteActionCompatParcelizer.read(contextThemeWrapperCompatApi17Impl, addmenu);
                    } else {
                        StringBuilder sb = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                        sb.append(read.RemoteActionCompatParcelizer);
                        throw new ParserException(sb.toString(), (Throwable) null, false, 1);
                    }
                }
                return read;
            }

            /* renamed from: o.WindowDecorActionBar$3$RemoteActionCompatParcelizer */
            static final class RemoteActionCompatParcelizer {
                public final int RemoteActionCompatParcelizer;
                public final long asInterface;

                private RemoteActionCompatParcelizer(int i, long j) {
                    this.RemoteActionCompatParcelizer = i;
                    this.asInterface = j;
                }

                public static RemoteActionCompatParcelizer read(AppCompatDelegateImpl.ContextThemeWrapperCompatApi17Impl contextThemeWrapperCompatApi17Impl, addMenu addmenu) throws IOException {
                    contextThemeWrapperCompatApi17Impl.asInterface(addmenu.onTransact, 0, 8);
                    if (addmenu.asInterface >= 0) {
                        addmenu.read = 0;
                        return new RemoteActionCompatParcelizer(addmenu.read(), addmenu.AudioAttributesCompatParcelizer());
                    }
                    throw new IllegalArgumentException();
                }
            }

            {
                Intrinsics.checkNotNullParameter(r2, "");
                this.asInterface = r2;
            }

            public final void read(ActivityResultContracts.StartIntentSenderForResult.Companion companion) {
                Intrinsics.checkNotNullParameter(companion, "");
                this.asInterface.onTransact(companion);
            }
        };
    }

    public final message onTransact(codename codename) {
        Intrinsics.checkNotNullParameter(codename, "");
        return new message(codename);
    }

    public final ContentView read(message message) {
        Intrinsics.checkNotNullParameter(message, "");
        return new ContentView(message);
    }

    public final ActivityResultContracts.StartActivityForResult RemoteActionCompatParcelizer(ActivityResultContracts.TakeVideo takeVideo) {
        Intrinsics.checkNotNullParameter(takeVideo, "");
        return takeVideo.onTransact();
    }
}
