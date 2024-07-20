package com.gojek.mqtt.persistence.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.HashSet;
import o.ActivityResultContracts;
import o.getClipDataUris$activity_release;

public final class MqttDatabase_Impl extends MqttDatabase {
    private volatile getClipDataUris$activity_release asBinder;
    private volatile ActivityResultContracts onTransact;

    public final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate() {
            public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `incoming_messages` (`message` BLOB NOT NULL, `msg_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ts` INTEGER NOT NULL, `topic` TEXT NOT NULL)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `paho_messages` (`key` TEXT NOT NULL, `header_bytes` BLOB NOT NULL, `header_offset` INTEGER NOT NULL, `header_length` INTEGER NOT NULL, `payload_bytes` BLOB NOT NULL, `payload_offset` INTEGER NOT NULL, `payload_length` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd8201fcd09dcd101838b0f6cee2bcce8')");
            }

            public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `incoming_messages`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `paho_messages`");
                if (MqttDatabase_Impl.this.mCallbacks != null) {
                    int size = MqttDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) MqttDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                    }
                }
            }

            public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (MqttDatabase_Impl.this.mCallbacks != null) {
                    int size = MqttDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) MqttDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                SupportSQLiteDatabase unused = MqttDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                MqttDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (MqttDatabase_Impl.this.mCallbacks != null) {
                    int size = MqttDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) MqttDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            public final RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(4);
                hashMap.put(Constants.MESSAGE, new TableInfo.Column(Constants.MESSAGE, "BLOB", true, 0, (String) null, 1));
                hashMap.put("msg_id", new TableInfo.Column("msg_id", "INTEGER", true, 1, (String) null, 1));
                hashMap.put("ts", new TableInfo.Column("ts", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("topic", new TableInfo.Column("topic", "TEXT", true, 0, (String) null, 1));
                TableInfo tableInfo = new TableInfo("incoming_messages", hashMap, new HashSet(0), new HashSet(0));
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "incoming_messages");
                if (!tableInfo.equals(read)) {
                    StringBuilder sb = new StringBuilder("incoming_messages(com.gojek.mqtt.persistence.model.MqttReceivePacket).\n Expected:\n");
                    sb.append(tableInfo);
                    sb.append("\n Found:\n");
                    sb.append(read);
                    return new RoomOpenHelper.ValidationResult(false, sb.toString());
                }
                HashMap hashMap2 = new HashMap(7);
                hashMap2.put(Constants.KEY, new TableInfo.Column(Constants.KEY, "TEXT", true, 1, (String) null, 1));
                hashMap2.put("header_bytes", new TableInfo.Column("header_bytes", "BLOB", true, 0, (String) null, 1));
                hashMap2.put("header_offset", new TableInfo.Column("header_offset", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("header_length", new TableInfo.Column("header_length", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("payload_bytes", new TableInfo.Column("payload_bytes", "BLOB", true, 0, (String) null, 1));
                hashMap2.put("payload_offset", new TableInfo.Column("payload_offset", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("payload_length", new TableInfo.Column("payload_length", "INTEGER", true, 0, (String) null, 1));
                TableInfo tableInfo2 = new TableInfo("paho_messages", hashMap2, new HashSet(0), new HashSet(0));
                TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "paho_messages");
                if (tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(true, (String) null);
                }
                StringBuilder sb2 = new StringBuilder("paho_messages(com.gojek.mqtt.persistence.model.MqttPahoPacket).\n Expected:\n");
                sb2.append(tableInfo2);
                sb2.append("\n Found:\n");
                sb2.append(read2);
                return new RoomOpenHelper.ValidationResult(false, sb2.toString());
            }
        }, "d8201fcd09dcd101838b0f6cee2bcce8", "a7b007fbb0c9080505895f7f304f2a69")).build());
    }

    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "incoming_messages", "paho_messages");
    }

    public final void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `incoming_messages`");
            writableDatabase.execSQL("DELETE FROM `paho_messages`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    public final ActivityResultContracts RemoteActionCompatParcelizer() {
        ActivityResultContracts activityResultContracts;
        if (this.onTransact != null) {
            return this.onTransact;
        }
        synchronized (this) {
            if (this.onTransact == null) {
                this.onTransact = new ActivityResultContracts.CaptureVideo(this);
            }
            activityResultContracts = this.onTransact;
        }
        return activityResultContracts;
    }

    public final getClipDataUris$activity_release onTransact() {
        getClipDataUris$activity_release getclipdatauris_activity_release;
        if (this.asBinder != null) {
            return this.asBinder;
        }
        synchronized (this) {
            if (this.asBinder == null) {
                this.asBinder = new ActivityResultContracts.GetMultipleContents.Companion(this);
            }
            getclipdatauris_activity_release = this.asBinder;
        }
        return getclipdatauris_activity_release;
    }
}
