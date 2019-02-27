package com.king.live.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * 项目名：KingLive
 * 包名：com.king.live.db
 * 创建者：guan_qi
 * 创建日期：2019/2/25 11:12
 * 邮箱：guan_qi@hoperun.com
 * 描述：
 */
public class RoomIdDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_COLLECT = "create table Collect ("
            + "id integer primary key autoincrement, "
            + "room_id text)";

    public static final String HEART_DB_NAME = "heartCollect.db";


    public RoomIdDatabaseHelper( Context context,  String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public RoomIdDatabaseHelper(Context context,  String name,  SQLiteDatabase.CursorFactory factory, int version,  DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    public RoomIdDatabaseHelper(Context context,  String name, int version,  SQLiteDatabase.OpenParams openParams) {
        super(context, name, version, openParams);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public List<Integer> getRoomIds() {
        List<Integer> roomIds = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query("Collect", null, null, null, null, null, null);
        if (cursor == null) {
            return roomIds;
        }

        while (cursor.moveToNext()) {
            int roomId = cursor.getInt(cursor.getColumnIndex("room_id"));
            roomIds.add(roomId);
        }

        cursor.close();
        return roomIds;
    }

    public void addRoomId(int roomId) {
        //已收藏就直接退出
        List<Integer> roomIds = getRoomIds();
        if (roomIds.contains(roomId)) {
            return;
        }

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("room_id", roomId);
        db.insert("Collect", null, values);
    }

    public void deleteRoomId(int roomId) {
        SQLiteDatabase db = this.getWritableDatabase();
        String id = Integer.toString(roomId);
        db.delete("Collect", "room_id = ?", new String[] {id});
    }
}
