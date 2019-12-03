package com.example.relinkr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "ReLinkr.db";

    private static DatabaseHelper databaseHelper;



    private DatabaseHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
//        new MemberDetailsTable(db);

        new UserAccount(db);
    }
    public static DatabaseHelper getInstance(Context context) {
        if (databaseHelper == null) {
            return databaseHelper = new DatabaseHelper(context);
        } else
            return databaseHelper;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean addAccountData(UserAccount userAccount) {
        UserAccount keyUserName = new UserAccount();

        try {
            SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(keyUserName.getCol1(), userAccount.getCol1());
            contentValues.put(keyUserName.getCol2(), userAccount.getCol2());
            contentValues.put(keyUserName.getCol3(), userAccount.getCol3());
            contentValues.put(keyUserName.getCol4(), userAccount.getCol4());
            contentValues.put(keyUserName.getCol5(), userAccount.getCol5());
            contentValues.put(keyUserName.getCol6(), userAccount.getCol6());
            contentValues.put(keyUserName.getCol7(), userAccount.getCol7());
            contentValues.put(keyUserName.getCol8(), userAccount.getCol8());
            contentValues.put(keyUserName.getCol9(), userAccount.getCol9());
            sqLiteDatabase.insert(keyUserName.getTable_Name(), null, contentValues);

            // sqLiteDatabase.insert(keyUserName.getCol2(), null, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }

    public boolean addAccountData(UserAccount userAccount) {
        UserAccount keyUserName = new UserAccount();

        try {
            SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(keyUserName.getCol1(), userAccount.getCol1());
            contentValues.put(keyUserName.getCol2(), userAccount.getCol2());
            contentValues.put(keyUserName.getCol3(), userAccount.getCol3());
            contentValues.put(keyUserName.getCol4(), userAccount.getCol4());
            contentValues.put(keyUserName.getCol5(), userAccount.getCol5());
            contentValues.put(keyUserName.getCol6(), userAccount.getCol6());
            contentValues.put(keyUserName.getCol7(), userAccount.getCol7());
            contentValues.put(keyUserName.getCol8(), userAccount.getCol8());
            contentValues.put(keyUserName.getCol9(), userAccount.getCol9());
            sqLiteDatabase.insert(keyUserName.getTable_Name(), null, contentValues);

            // sqLiteDatabase.insert(keyUserName.getCol2(), null, contentValues);
            return true;
        } catch (Exception e) {
            e.printStackTrace();

        }
        return false;
    }
    public Cursor getlogin(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from UserAccount", null);
        return cursor;
    }
    }
