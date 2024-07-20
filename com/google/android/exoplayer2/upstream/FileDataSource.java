package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.showsIcon;
import o.updateNavigationIcon;

public final class FileDataSource extends ExtendedFloatingActionButton.asInterface {
    private Uri IconCompatParcelizer;
    private RandomAccessFile RemoteActionCompatParcelizer;
    private boolean asInterface;
    private long onTransact;

    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public FileDataSource() {
        super(false);
    }

    public final long read(showsIcon showsicon) throws FileDataSourceException {
        Uri uri = showsicon.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = uri;
        RemoteActionCompatParcelizer();
        RandomAccessFile read = read(uri);
        this.RemoteActionCompatParcelizer = read;
        try {
            read.seek(showsicon.IconCompatParcelizer);
            long length = showsicon.AudioAttributesImplApi26Parcelizer == -1 ? this.RemoteActionCompatParcelizer.length() - showsicon.IconCompatParcelizer : showsicon.AudioAttributesImplApi26Parcelizer;
            this.onTransact = length;
            if (length >= 0) {
                this.asInterface = true;
                asInterface(showsicon);
                return this.onTransact;
            }
            throw new FileDataSourceException((String) null, (Throwable) null, 2008);
        } catch (IOException e) {
            throw new FileDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }

    public final int onTransact(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.onTransact;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.RemoteActionCompatParcelizer.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.onTransact -= (long) read;
                onTransact(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }

    public final Uri asInterface() {
        return this.IconCompatParcelizer;
    }

    public final void read() throws FileDataSourceException {
        this.IconCompatParcelizer = null;
        try {
            RandomAccessFile randomAccessFile = this.RemoteActionCompatParcelizer;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.RemoteActionCompatParcelizer = null;
            if (this.asInterface) {
                this.asInterface = false;
                asBinder();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th) {
            this.RemoteActionCompatParcelizer = null;
            if (this.asInterface) {
                this.asInterface = false;
                asBinder();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r3 == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.RandomAccessFile read(android.net.Uri r5) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        /*
            r0 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0020, SecurityException -> 0x0019, RuntimeException -> 0x0010 }
            java.lang.String r2 = r5.getPath()     // Catch:{ FileNotFoundException -> 0x0020, SecurityException -> 0x0019, RuntimeException -> 0x0010 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ FileNotFoundException -> 0x0020, SecurityException -> 0x0019, RuntimeException -> 0x0010 }
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch:{ FileNotFoundException -> 0x0020, SecurityException -> 0x0019, RuntimeException -> 0x0010 }
            return r1
        L_0x0010:
            r5 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r0 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r1 = 2000(0x7d0, float:2.803E-42)
            r0.<init>(r5, r1)
            throw r0
        L_0x0019:
            r5 = move-exception
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r1 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r1.<init>(r5, r0)
            throw r1
        L_0x0020:
            r1 = move-exception
            java.lang.String r2 = r5.getQuery()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = r5.getFragment()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0059
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            r2 = 21
            if (r5 < r2) goto L_0x0051
            java.lang.Throwable r5 = r1.getCause()
            boolean r2 = r5 instanceof android.system.ErrnoException
            if (r2 == 0) goto L_0x004e
            android.system.ErrnoException r5 = (android.system.ErrnoException) r5
            int r5 = r5.errno
            int r2 = android.system.OsConstants.EACCES
            if (r5 != r2) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            if (r3 != 0) goto L_0x0053
        L_0x0051:
            r0 = 2005(0x7d5, float:2.81E-42)
        L_0x0053:
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r5 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            r5.<init>(r1, r0)
            throw r5
        L_0x0059:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r5.getPath()
            r0[r4] = r2
            java.lang.String r2 = r5.getQuery()
            r0[r3] = r2
            r2 = 2
            java.lang.String r5 = r5.getFragment()
            r0[r2] = r5
            com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException r5 = new com.google.android.exoplayer2.upstream.FileDataSource$FileDataSourceException
            java.lang.String r2 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r2 = 1004(0x3ec, float:1.407E-42)
            r5.<init>(r0, r1, r2)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.FileDataSource.read(android.net.Uri):java.io.RandomAccessFile");
    }

    public static final class asInterface implements ActivityResultContracts.StartIntentSenderForResult.Companion {
        private final String AudioAttributesCompatParcelizer;
        private final String AudioAttributesImplApi21Parcelizer;
        private final String RemoteActionCompatParcelizer;
        private final String asBinder;
        private final String asInterface;
        private final String onTransact;
        private final String read;

        public final String asBinder() {
            return "Notification MediaUrl Format Incorrect";
        }

        public asInterface(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.AudioAttributesImplApi21Parcelizer = str;
            this.onTransact = str2;
            this.read = str3;
            this.RemoteActionCompatParcelizer = str4;
            this.AudioAttributesCompatParcelizer = str5;
            this.asInterface = str6;
            this.asBinder = str7;
        }

        public final Map<String, Object> asInterface() {
            return updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("transactionId", this.AudioAttributesImplApi21Parcelizer), new Pair("notificationId", this.onTransact), new Pair("campaignName", this.read), new Pair("campaignId", this.RemoteActionCompatParcelizer), new Pair("notificationType", this.AudioAttributesCompatParcelizer), new Pair("displayType", this.asInterface), new Pair("mediaUrl", this.asBinder)});
        }
    }
}
