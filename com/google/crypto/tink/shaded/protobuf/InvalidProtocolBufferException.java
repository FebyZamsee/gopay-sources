package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import o.AppCompatTextViewAutoSizeHelper;

public class InvalidProtocolBufferException extends IOException {
    public AppCompatTextViewAutoSizeHelper.Api16Impl asBinder = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public static InvalidProtocolBufferException write() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static InvalidProtocolBufferException AudioAttributesImplApi21Parcelizer() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException onTransact() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public static InvalidProtocolBufferException read() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public static InvalidProtocolBufferException asInterface() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    public static InvalidWireTypeException asBinder() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public static InvalidProtocolBufferException AudioAttributesCompatParcelizer() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static InvalidProtocolBufferException IconCompatParcelizer() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    public static InvalidProtocolBufferException RemoteActionCompatParcelizer() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }
}
