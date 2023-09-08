package com.example.sara;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {
    public DBhelper(@Nullable Context context) {
        super(context, "favoritewords.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table favoritewords (word TEXT primary key,mean TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop Table if exists favoritewords");

    }
    public Boolean insertdata(String word,String mean){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put("word",word);
        contentValues.put("mean",mean);
        long results=db.insert("favoritewords",null,contentValues);
        if (results== -1){
            return  false;
        }else{
            return true;
        }

    }

    public Boolean deletedata(String word){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from favoritewords where word = ?",new String[] {word});
        if (cursor.getCount()>0){
            long results=db.delete("favoritewords","word=?",new String[] {word});
            if (results== -1){
                return  false;
            }else{
                return true;
            }

        }else {
            return false;
        }

    }
    public Cursor getdata(){
        SQLiteDatabase db= this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from favoritewords ",null);
        return cursor;

    }
}
