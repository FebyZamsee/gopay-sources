package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import o.showsIcon;

public final class UdpDataSource extends ExtendedFloatingActionButton.asInterface {
    private DatagramSocket AudioAttributesCompatParcelizer;
    private final DatagramPacket AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private int IconCompatParcelizer;
    private MulticastSocket RemoteActionCompatParcelizer;
    private InetAddress asInterface;
    private Uri onConnectionFailed;
    private boolean onTransact;
    private final byte[] write;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th, int i) {
            super(th, i);
        }
    }

    public UdpDataSource() {
        this((byte) 0);
    }

    private UdpDataSource(byte b) {
        this((int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    private UdpDataSource(int i) {
        super(true);
        this.AudioAttributesImplApi26Parcelizer = 8000;
        byte[] bArr = new byte[CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE];
        this.write = bArr;
        this.AudioAttributesImplApi21Parcelizer = new DatagramPacket(bArr, 0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    public final long read(showsIcon showsicon) throws UdpDataSourceException {
        Uri uri = showsicon.AudioAttributesCompatParcelizer;
        this.onConnectionFailed = uri;
        String host = uri.getHost();
        int port = this.onConnectionFailed.getPort();
        RemoteActionCompatParcelizer();
        try {
            this.asInterface = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.asInterface, port);
            if (this.asInterface.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.RemoteActionCompatParcelizer = multicastSocket;
                multicastSocket.joinGroup(this.asInterface);
                this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer;
            } else {
                this.AudioAttributesCompatParcelizer = new DatagramSocket(inetSocketAddress);
            }
            this.AudioAttributesCompatParcelizer.setSoTimeout(this.AudioAttributesImplApi26Parcelizer);
            this.onTransact = true;
            asInterface(showsicon);
            return -1;
        } catch (SecurityException e) {
            throw new UdpDataSourceException(e, 2006);
        } catch (IOException e2) {
            throw new UdpDataSourceException(e2, 2001);
        }
    }

    public final int onTransact(byte[] bArr, int i, int i2) throws UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.IconCompatParcelizer == 0) {
            try {
                this.AudioAttributesCompatParcelizer.receive(this.AudioAttributesImplApi21Parcelizer);
                int length = this.AudioAttributesImplApi21Parcelizer.getLength();
                this.IconCompatParcelizer = length;
                onTransact(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = this.AudioAttributesImplApi21Parcelizer.getLength();
        int i3 = this.IconCompatParcelizer;
        int min = Math.min(i3, i2);
        System.arraycopy(this.write, length2 - i3, bArr, i, min);
        this.IconCompatParcelizer -= min;
        return min;
    }

    public final Uri asInterface() {
        return this.onConnectionFailed;
    }

    public final void read() {
        this.onConnectionFailed = null;
        MulticastSocket multicastSocket = this.RemoteActionCompatParcelizer;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.asInterface);
            } catch (IOException unused) {
            }
            this.RemoteActionCompatParcelizer = null;
        }
        DatagramSocket datagramSocket = this.AudioAttributesCompatParcelizer;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.AudioAttributesCompatParcelizer = null;
        }
        this.asInterface = null;
        this.IconCompatParcelizer = 0;
        if (this.onTransact) {
            this.onTransact = false;
            asBinder();
        }
    }
}
