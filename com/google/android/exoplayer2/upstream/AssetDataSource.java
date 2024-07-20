package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource extends ExtendedFloatingActionButton.asInterface {
    private static int IconCompatParcelizer = 1;
    private static int write;
    private Uri AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private long RemoteActionCompatParcelizer;
    private InputStream asInterface;
    private final AssetManager onTransact;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.onTransact = context.getAssets();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long read(o.showsIcon r12) throws com.google.android.exoplayer2.upstream.AssetDataSource.AssetDataSourceException {
        /*
            r11 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "startsWith"
            android.net.Uri r2 = r12.AudioAttributesCompatParcelizer     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            r11.AudioAttributesCompatParcelizer = r2     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            java.lang.String r2 = r2.getPath()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            java.lang.String r3 = "/android_asset/"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x015d }
            r6 = 0
            r5[r6] = r3     // Catch:{ all -> 0x015d }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x015d }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r6] = r8     // Catch:{ all -> 0x015d }
            java.lang.reflect.Method r3 = r3.getMethod(r1, r7)     // Catch:{ all -> 0x015d }
            java.lang.Object r3 = r3.invoke(r2, r5)     // Catch:{ all -> 0x015d }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x015d }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x015d }
            java.lang.String r5 = "substring"
            r7 = 2
            if (r3 == 0) goto L_0x0061
            r1 = 15
            int r3 = write
            int r3 = r3 + 7
            int r8 = r3 % 128
            IconCompatParcelizer = r8
            int r3 = r3 % r7
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0058 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0058 }
            r3[r6] = r1     // Catch:{ all -> 0x0058 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x0058 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0058 }
            r8[r6] = r9     // Catch:{ all -> 0x0058 }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r8)     // Catch:{ all -> 0x0058 }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{ all -> 0x0058 }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0058 }
            goto L_0x00bb
        L_0x0058:
            r12 = move-exception
            java.lang.Throwable r0 = r12.getCause()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            if (r0 == 0) goto L_0x0060
            throw r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x0060:
            throw r12     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x0061:
            java.lang.String r3 = "/"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0154 }
            r8[r6] = r3     // Catch:{ all -> 0x0154 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ all -> 0x0154 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r6] = r10     // Catch:{ all -> 0x0154 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r9)     // Catch:{ all -> 0x0154 }
            java.lang.Object r1 = r1.invoke(r2, r8)     // Catch:{ all -> 0x0154 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0154 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0154 }
            if (r1 == 0) goto L_0x0081
            r1 = 0
            goto L_0x0082
        L_0x0081:
            r1 = 1
        L_0x0082:
            if (r1 == r4) goto L_0x00bb
            int r1 = IconCompatParcelizer
            int r1 = r1 + 25
            int r3 = r1 % 128
            write = r3
            int r1 = r1 % r7
            int r1 = write
            int r1 = r1 + 73
            int r3 = r1 % 128
            IconCompatParcelizer = r3
            int r1 = r1 % r7
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00b2 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            r1[r6] = r3     // Catch:{ all -> 0x00b2 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x00b2 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b2 }
            r8[r6] = r9     // Catch:{ all -> 0x00b2 }
            java.lang.reflect.Method r3 = r3.getMethod(r5, r8)     // Catch:{ all -> 0x00b2 }
            java.lang.Object r1 = r3.invoke(r2, r1)     // Catch:{ all -> 0x00b2 }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b2 }
            goto L_0x00bb
        L_0x00b2:
            r12 = move-exception
            java.lang.Throwable r0 = r12.getCause()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            if (r0 == 0) goto L_0x00ba
            throw r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x00ba:
            throw r12     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x00bb:
            r11.RemoteActionCompatParcelizer()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            android.content.res.AssetManager r1 = r11.onTransact     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x014b }
            r3[r4] = r2     // Catch:{ all -> 0x014b }
            r3[r6] = r1     // Catch:{ all -> 0x014b }
            r1 = 51420(0xc8dc, float:7.2055E-41)
            int r2 = android.graphics.Color.green(r6)     // Catch:{ all -> 0x014b }
            int r2 = r2 + r1
            char r1 = (char) r2     // Catch:{ all -> 0x014b }
            int r2 = android.os.Process.myTid()     // Catch:{ all -> 0x014b }
            int r2 = r2 >> 22
            int r2 = 19 - r2
            int r0 = android.text.TextUtils.indexOf(r0, r0, r6)     // Catch:{ all -> 0x014b }
            java.lang.Object r0 = o.onItemClicked.onTransact(r1, r2, r0)     // Catch:{ all -> 0x014b }
            java.lang.Class r0 = (java.lang.Class) r0     // Catch:{ all -> 0x014b }
            java.lang.String r1 = "read"
            java.lang.Class[] r2 = new java.lang.Class[r7]     // Catch:{ all -> 0x014b }
            java.lang.Class<android.content.res.AssetManager> r5 = android.content.res.AssetManager.class
            r2[r6] = r5     // Catch:{ all -> 0x014b }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r2[r4] = r5     // Catch:{ all -> 0x014b }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch:{ all -> 0x014b }
            r1 = 0
            java.lang.Object r0 = r0.invoke(r1, r3)     // Catch:{ all -> 0x014b }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ all -> 0x014b }
            r11.asInterface = r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            long r2 = r12.IconCompatParcelizer     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            long r2 = r0.skip(r2)     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            long r8 = r12.IconCompatParcelizer     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0143
            int r0 = IconCompatParcelizer
            int r0 = r0 + 9
            int r1 = r0 % 128
            write = r1
            int r0 = r0 % r7
            long r0 = r12.AudioAttributesImplApi26Parcelizer     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0125
            long r0 = r12.AudioAttributesImplApi26Parcelizer     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            r11.RemoteActionCompatParcelizer = r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            int r0 = write
            int r0 = r0 + 39
            int r1 = r0 % 128
            IconCompatParcelizer = r1
            int r0 = r0 % r7
            goto L_0x013b
        L_0x0125:
            java.io.InputStream r0 = r11.asInterface     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            int r0 = r0.available()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            long r0 = (long) r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            r11.RemoteActionCompatParcelizer = r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0136
            r6 = 1
        L_0x0136:
            if (r6 == r4) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            r11.RemoteActionCompatParcelizer = r2     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x013b:
            r11.AudioAttributesImplApi26Parcelizer = r4
            r11.asInterface(r12)
            long r0 = r11.RemoteActionCompatParcelizer
            return r0
        L_0x0143:
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r12 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            r0 = 2008(0x7d8, float:2.814E-42)
            r12.<init>(r1, r0)     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            throw r12     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x014b:
            r12 = move-exception
            java.lang.Throwable r0 = r12.getCause()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            if (r0 == 0) goto L_0x0153
            throw r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x0153:
            throw r12     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x0154:
            r12 = move-exception
            java.lang.Throwable r0 = r12.getCause()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            if (r0 == 0) goto L_0x015c
            throw r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x015c:
            throw r12     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x015d:
            r12 = move-exception
            java.lang.Throwable r0 = r12.getCause()     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
            if (r0 == 0) goto L_0x0165
            throw r0     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x0165:
            throw r12     // Catch:{ AssetDataSourceException -> 0x0176, IOException -> 0x0166 }
        L_0x0166:
            r12 = move-exception
            boolean r0 = r12 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L_0x016e
            r0 = 2005(0x7d5, float:2.81E-42)
            goto L_0x0170
        L_0x016e:
            r0 = 2000(0x7d0, float:2.803E-42)
        L_0x0170:
            com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException r1 = new com.google.android.exoplayer2.upstream.AssetDataSource$AssetDataSourceException
            r1.<init>(r12, r0)
            throw r1
        L_0x0176:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.AssetDataSource.read(o.showsIcon):long");
    }

    public final int onTransact(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.RemoteActionCompatParcelizer;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        int read = this.asInterface.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.RemoteActionCompatParcelizer;
        if (j2 != -1) {
            this.RemoteActionCompatParcelizer = j2 - ((long) read);
        }
        onTransact(read);
        return read;
    }

    public final Uri asInterface() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read() throws AssetDataSourceException {
        this.AudioAttributesCompatParcelizer = null;
        try {
            InputStream inputStream = this.asInterface;
            if (inputStream != null) {
                inputStream.close();
            }
            this.asInterface = null;
            if (this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = false;
                asBinder();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th) {
            this.asInterface = null;
            if (this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = false;
                asBinder();
            }
            throw th;
        }
    }
}
