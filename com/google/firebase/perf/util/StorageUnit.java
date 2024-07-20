package com.google.firebase.perf.util;

public enum StorageUnit {
    TERABYTES(1099511627776L) {
    },
    GIGABYTES(1073741824) {
    },
    MEGABYTES(1048576) {
    },
    KILOBYTES(1024) {
    },
    BYTES(1) {
    };
    
    long numBytes;

    private StorageUnit(long j) {
        this.numBytes = j;
    }

    public long toKilobytes(long j) {
        return (j * this.numBytes) / KILOBYTES.numBytes;
    }
}
