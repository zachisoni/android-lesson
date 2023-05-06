package com.example.asad_ti4b

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.asad_ti4b.data.Alumni
import com.example.asad_ti4b.sql.DataBaseOpenHelper

class LihatDataActivity : AppCompatActivity() {
    lateinit var sqlLiteDatabase : SQLiteDatabase
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat_data)

        listView = findViewById(R.id.listView)
    }

    fun getData(){
        openDatabase()
        var cursor = sqlLiteDatabase.rawQuery("SELECT * FROM ", null)
        var data = ArrayList<Alumni>()
        if(cursor.moveToFirst())
            do {
                var alumni = Alumni()
                alumni.id = cursor.getInt(0)
                alumni.nama = cursor.getString(1)
                alumni.pekerjaan = cursor.getString(2)
            }while()
    }

    fun openDatabase(){
        sqlLiteDatabase = DataBaseOpenHelper(this).writableDatabase
    }

    fun closeDatabase(){
        sqlLiteDatabase.close()
    }
}