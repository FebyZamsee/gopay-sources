package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import o.showsIcon;

public final class RawResourceDataSource extends ExtendedFloatingActionButton.asInterface {
    private final Resources AudioAttributesCompatParcelizer;
    private Uri AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private AssetFileDescriptor RemoteActionCompatParcelizer;
    private long asInterface;
    private InputStream onTransact;
    private final String write;

    public static class RawResourceDataSourceException extends DataSourceException {
        public RawResourceDataSourceException(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.AudioAttributesCompatParcelizer = context.getResources();
        this.write = context.getPackageName();
    }

    public final long read(showsIcon showsicon) throws RawResourceDataSourceException {
        int i;
        String str;
        showsIcon showsicon2 = showsicon;
        Uri uri = showsicon2.AudioAttributesCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = uri;
        if (TextUtils.equals("rawresource", uri.getScheme()) || (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1 && uri.getLastPathSegment().matches("\\d+"))) {
            try {
                i = Integer.parseInt(uri.getLastPathSegment());
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", (Throwable) null, 1004);
            }
        } else if (TextUtils.equals("android.resource", uri.getScheme())) {
            String path = uri.getPath();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uri.getHost();
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(host)) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(host);
                sb2.append(":");
                str = sb2.toString();
            }
            sb.append(str);
            sb.append(path);
            i = this.AudioAttributesCompatParcelizer.getIdentifier(sb.toString(), "raw", this.write);
            if (i == 0) {
                throw new RawResourceDataSourceException("Resource not found.", (Throwable) null, 2005);
            }
        } else {
            throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", (Throwable) null, 1004);
        }
        RemoteActionCompatParcelizer();
        try {
            AssetFileDescriptor openRawResourceFd = this.AudioAttributesCompatParcelizer.openRawResourceFd(i);
            this.RemoteActionCompatParcelizer = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.onTransact = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    try {
                        if (showsicon2.IconCompatParcelizer > length) {
                            throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
                        }
                    } catch (RawResourceDataSourceException e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RawResourceDataSourceException((String) null, e2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(showsicon2.IconCompatParcelizer + startOffset) - startOffset;
                if (skip == showsicon2.IconCompatParcelizer) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.asInterface = -1;
                        } else {
                            long size = channel.size() - channel.position();
                            this.asInterface = size;
                            if (size < 0) {
                                throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.asInterface = j;
                        if (j < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                    if (showsicon2.AudioAttributesImplApi26Parcelizer != -1) {
                        long j2 = this.asInterface;
                        this.asInterface = j2 == -1 ? showsicon2.AudioAttributesImplApi26Parcelizer : Math.min(j2, showsicon2.AudioAttributesImplApi26Parcelizer);
                    }
                    this.AudioAttributesImplApi26Parcelizer = true;
                    asInterface(showsicon);
                    return showsicon2.AudioAttributesImplApi26Parcelizer != -1 ? showsicon2.AudioAttributesImplApi26Parcelizer : this.asInterface;
                }
                throw new RawResourceDataSourceException((String) null, (Throwable) null, 2008);
            }
            StringBuilder sb3 = new StringBuilder("Resource is compressed: ");
            sb3.append(uri);
            throw new RawResourceDataSourceException(sb3.toString(), (Throwable) null, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException((String) null, e3, 2005);
        }
    }

    public final int onTransact(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.asInterface;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException((String) null, e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        int read = this.onTransact.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.asInterface;
            if (j2 != -1) {
                this.asInterface = j2 - ((long) read);
            }
            onTransact(read);
            return read;
        } else if (this.asInterface == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        }
    }

    public final Uri asInterface() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void read() throws RawResourceDataSourceException {
        this.AudioAttributesImplApi21Parcelizer = null;
        try {
            InputStream inputStream = this.onTransact;
            if (inputStream != null) {
                inputStream.close();
            }
            this.onTransact = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.RemoteActionCompatParcelizer;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.RemoteActionCompatParcelizer = null;
                if (this.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi26Parcelizer = false;
                    asBinder();
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException((String) null, e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            } catch (Throwable th) {
                this.RemoteActionCompatParcelizer = null;
                if (this.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi26Parcelizer = false;
                    asBinder();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException((String) null, e2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th2) {
            this.onTransact = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.RemoteActionCompatParcelizer;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.RemoteActionCompatParcelizer = null;
                if (this.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi26Parcelizer = false;
                    asBinder();
                }
                throw th2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException((String) null, e3, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            } catch (Throwable th3) {
                this.RemoteActionCompatParcelizer = null;
                if (this.AudioAttributesImplApi26Parcelizer) {
                    this.AudioAttributesImplApi26Parcelizer = false;
                    asBinder();
                }
                throw th3;
            }
        }
    }
}
