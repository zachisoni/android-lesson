package com.example.asad_ti4b

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.asad_ti4b.data.Alumni
import com.example.asad_ti4b.sql.DataBaseOpenHelper

class TambahDataActivity : AppCompatActivity() {
    lateinit var sqlLiteDatabase : SQLiteDatabase
    lateinit var edtNama : EditText
    lateinit var edtPekerjaan : EditText
    lateinit var btnSimpan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_data)

        edtNama = findViewById(R.id.edtNama)
        edtPekerjaan = findViewById(R.id.edtPekerjaan)
        btnSimpan = findViewById(R.id.btnSimpan)

        btnSimpan.setOnClickListener {
            if(!edtNama.text.isEmpty() || !edtPekerjaan.text.isEmpty()){
                openDatabases()

                var contentValue = ContentValues()
                contentValue.put("nama", edtNama.text.toString())
                contentValue.put("Pekerjaan", edtPekerjaan.text.toString())

                var insert : Long = sqlLiteDatabase.insert("tb_alumni", null, contentValue)

                if( !insert.equals(-1)){
                    Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this, "Data GagalDisimpan", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    fun setData() {
        openDatabases()
        var cursor = sqlLiteDatabase.rawQuery("SELECT * FROM ", null)
        var data = ArrayList<Alumni>()
        if (cursor.moveToFirst())
            do {
                var alumni = Alumni()
                alumni.id = cursor.getInt(0)
                alumni.nama = cursor.getString(1)
                alumni.pekerjaan = cursor.getString(2)

            }
    }

    fun openDatabases(){
        sqlLiteDatabase = DataBaseOpenHelper(this).writableDatabase
    }

    fun closeDatabases(){
        sqlLiteDatabase.close()
    }

}