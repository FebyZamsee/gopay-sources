package com.pichillilorenzo.flutter_inappwebview.credential_database;

import android.content.ContentValues;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.List;

public class URLProtectionSpaceDao {
    CredentialDatabaseHelper credentialDatabaseHelper;
    String[] projection = {"_id", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT};

    public URLProtectionSpaceDao(CredentialDatabaseHelper credentialDatabaseHelper2) {
        this.credentialDatabaseHelper = credentialDatabaseHelper2;
    }

    public List<URLProtectionSpace> getAll() {
        Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, this.projection, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            long j = query.getLong(query.getColumnIndexOrThrow("_id"));
            arrayList.add(new URLProtectionSpace(Long.valueOf(j), query.getString(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)), query.getString(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)), query.getString(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM)), query.getInt(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))));
        }
        query.close();
        return arrayList;
    }

    public URLProtectionSpace find(String str, String str2, String str3, Integer num) {
        URLProtectionSpace uRLProtectionSpace;
        Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, this.projection, "host = ? AND protocol = ? AND realm = ? AND port = ?", new String[]{str, str2, str3, num.toString()}, (String) null, (String) null, (String) null);
        if (query.moveToNext()) {
            long j = query.getLong(query.getColumnIndexOrThrow("_id"));
            uRLProtectionSpace = new URLProtectionSpace(Long.valueOf(j), query.getString(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST)), query.getString(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL)), query.getString(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM)), query.getInt(query.getColumnIndexOrThrow(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)));
        } else {
            uRLProtectionSpace = null;
        }
        query.close();
        return uRLProtectionSpace;
    }

    public long insert(URLProtectionSpace uRLProtectionSpace) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, uRLProtectionSpace.getHost());
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL, uRLProtectionSpace.getProtocol());
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, uRLProtectionSpace.getRealm());
        contentValues.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(uRLProtectionSpace.getPort()));
        return this.credentialDatabaseHelper.getWritableDatabase().insert(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, (String) null, contentValues);
    }

    public long delete(URLProtectionSpace uRLProtectionSpace) {
        return (long) this.credentialDatabaseHelper.getWritableDatabase().delete(URLProtectionSpaceContract.FeedEntry.TABLE_NAME, "_id = ?", new String[]{uRLProtectionSpace.getId().toString()});
    }
}
