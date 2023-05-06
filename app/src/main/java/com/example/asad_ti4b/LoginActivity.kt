package com.example.asad_ti4b

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var data = getSharedPreferences("dataLogin", Context.MODE_PRIVATE)

//        if(data.getBoolean())
    }




}