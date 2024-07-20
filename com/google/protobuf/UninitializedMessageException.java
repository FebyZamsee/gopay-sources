package com.google.protobuf;

import java.util.List;

public class UninitializedMessageException extends RuntimeException {
    private final List<String> asInterface = null;

    public UninitializedMessageException() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
