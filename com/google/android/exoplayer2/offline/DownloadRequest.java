package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o.getIntrinsicWidth;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    private Uri IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private String asBinder;
    private String asInterface;
    private byte[] onTransact;
    private byte[] read;
    private List<getIntrinsicWidth> write;

    public static class UnsupportedRequestException extends IOException {
    }

    public final int describeContents() {
        return 0;
    }

    DownloadRequest(Parcel parcel) {
        this.asBinder = parcel.readString();
        this.IconCompatParcelizer = Uri.parse(parcel.readString());
        this.RemoteActionCompatParcelizer = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((getIntrinsicWidth) parcel.readParcelable(getIntrinsicWidth.class.getClassLoader()));
        }
        this.write = Collections.unmodifiableList(arrayList);
        this.read = parcel.createByteArray();
        this.asInterface = parcel.readString();
        this.onTransact = parcel.createByteArray();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(":");
        sb.append(this.asBinder);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.asBinder.equals(downloadRequest.asBinder) || !this.IconCompatParcelizer.equals(downloadRequest.IconCompatParcelizer)) {
            return false;
        }
        String str = this.RemoteActionCompatParcelizer;
        String str2 = downloadRequest.RemoteActionCompatParcelizer;
        if (!(str == null ? str2 == null : str.equals(str2)) || !this.write.equals(downloadRequest.write) || !Arrays.equals(this.read, downloadRequest.read)) {
            return false;
        }
        String str3 = this.asInterface;
        String str4 = downloadRequest.asInterface;
        if (!(str3 == null ? str4 == null : str3.equals(str4)) || !Arrays.equals(this.onTransact, downloadRequest.onTransact)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.asBinder.hashCode();
        int hashCode2 = this.IconCompatParcelizer.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int i = 0;
        int hashCode3 = str != null ? str.hashCode() : 0;
        int hashCode4 = this.write.hashCode();
        int hashCode5 = Arrays.hashCode(this.read);
        String str2 = this.asInterface;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((((((hashCode * 31 * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + Arrays.hashCode(this.onTransact);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.asBinder);
        parcel.writeString(this.IconCompatParcelizer.toString());
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.write.size());
        for (int i2 = 0; i2 < this.write.size(); i2++) {
            parcel.writeParcelable(this.write.get(i2), 0);
        }
        parcel.writeByteArray(this.read);
        parcel.writeString(this.asInterface);
        parcel.writeByteArray(this.onTransact);
    }
}
