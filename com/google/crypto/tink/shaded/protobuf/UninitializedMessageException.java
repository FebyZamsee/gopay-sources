package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private final List<String> asBinder = null;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
