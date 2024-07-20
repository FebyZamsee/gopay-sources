package com.gojek.mqtt.persistence.db;

import androidx.room.RoomDatabase;
import o.ActivityResultContracts;
import o.getClipDataUris$activity_release;

public abstract class MqttDatabase extends RoomDatabase {
    public abstract ActivityResultContracts RemoteActionCompatParcelizer();

    public abstract getClipDataUris$activity_release onTransact();
}
