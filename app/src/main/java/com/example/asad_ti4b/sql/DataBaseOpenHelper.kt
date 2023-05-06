package com.example.asad_ti4b.sql

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DataBaseOpenHelper(
    context : Context?
): SQLiteOpenHelper(context, "db_alumni", null, 1){

    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            db.execSQL("CREATE TABLE tb_alumni (id INT PRIMARY KEY AUTOINCREMENT, nama VARCHAR(100), pekerjaan VARCHAR(100))")
        }
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}