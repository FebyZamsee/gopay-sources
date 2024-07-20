package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import o.showsIcon;

public final class ContentDataSource extends ExtendedFloatingActionButton.asInterface {
    private final ContentResolver AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private Uri AudioAttributesImplApi26Parcelizer;
    private long RemoteActionCompatParcelizer;
    private AssetFileDescriptor asInterface;
    private FileInputStream onTransact;

    public static class ContentDataSourceException extends DataSourceException {
        public ContentDataSourceException(IOException iOException, int i) {
            super((Throwable) iOException, i);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.AudioAttributesCompatParcelizer = context.getContentResolver();
    }

    public final long read(showsIcon showsicon) throws ContentDataSourceException {
        AssetFileDescriptor assetFileDescriptor;
        showsIcon showsicon2 = showsicon;
        int i = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        try {
            Uri uri = showsicon2.AudioAttributesCompatParcelizer;
            this.AudioAttributesImplApi26Parcelizer = uri;
            RemoteActionCompatParcelizer();
            if ("content".equals(showsicon2.AudioAttributesCompatParcelizer.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptor = this.AudioAttributesCompatParcelizer.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = this.AudioAttributesCompatParcelizer.openAssetFileDescriptor(uri, "r");
            }
            this.asInterface = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.onTransact = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i2 != 0) {
                    if (showsicon2.IconCompatParcelizer > length) {
                        throw new ContentDataSourceException((IOException) null, 2008);
                    }
                }
                long startOffset = assetFileDescriptor.getStartOffset();
                long j = length;
                long skip = fileInputStream.skip(showsicon2.IconCompatParcelizer + startOffset) - startOffset;
                if (skip == showsicon2.IconCompatParcelizer) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.RemoteActionCompatParcelizer = -1;
                        } else {
                            long position = size - channel.position();
                            this.RemoteActionCompatParcelizer = position;
                            if (position < 0) {
                                throw new ContentDataSourceException((IOException) null, 2008);
                            }
                        }
                    } else {
                        long j2 = j - skip;
                        this.RemoteActionCompatParcelizer = j2;
                        if (j2 < 0) {
                            throw new ContentDataSourceException((IOException) null, 2008);
                        }
                    }
                    if (showsicon2.AudioAttributesImplApi26Parcelizer != -1) {
                        long j3 = this.RemoteActionCompatParcelizer;
                        this.RemoteActionCompatParcelizer = j3 == -1 ? showsicon2.AudioAttributesImplApi26Parcelizer : Math.min(j3, showsicon2.AudioAttributesImplApi26Parcelizer);
                    }
                    this.AudioAttributesImplApi21Parcelizer = true;
                    asInterface(showsicon);
                    return showsicon2.AudioAttributesImplApi26Parcelizer != -1 ? showsicon2.AudioAttributesImplApi26Parcelizer : this.RemoteActionCompatParcelizer;
                }
                throw new ContentDataSourceException((IOException) null, 2008);
            }
            StringBuilder sb = new StringBuilder("Could not open file descriptor for: ");
            sb.append(uri);
            throw new ContentDataSourceException(new IOException(sb.toString()), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new ContentDataSourceException(e2, i);
        }
    }

    public final int onTransact(byte[] bArr, int i, int i2) throws ContentDataSourceException {
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
                throw new ContentDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            }
        }
        int read = this.onTransact.read(bArr, i, i2);
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
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read() throws ContentDataSourceException {
        this.AudioAttributesImplApi26Parcelizer = null;
        try {
            FileInputStream fileInputStream = this.onTransact;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.onTransact = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.asInterface;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.asInterface = null;
                if (this.AudioAttributesImplApi21Parcelizer) {
                    this.AudioAttributesImplApi21Parcelizer = false;
                    asBinder();
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            } catch (Throwable th) {
                this.asInterface = null;
                if (this.AudioAttributesImplApi21Parcelizer) {
                    this.AudioAttributesImplApi21Parcelizer = false;
                    asBinder();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        } catch (Throwable th2) {
            this.onTransact = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.asInterface;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.asInterface = null;
                if (this.AudioAttributesImplApi21Parcelizer) {
                    this.AudioAttributesImplApi21Parcelizer = false;
                    asBinder();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            } catch (Throwable th3) {
                this.asInterface = null;
                if (this.AudioAttributesImplApi21Parcelizer) {
                    this.AudioAttributesImplApi21Parcelizer = false;
                    asBinder();
                }
                throw th3;
            }
        }
    }
}
