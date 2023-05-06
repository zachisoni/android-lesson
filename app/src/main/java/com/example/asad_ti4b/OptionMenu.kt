package com.example.asad_ti4b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class OptionMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var menu_inflater = menuInflater
        menu_inflater.inflate(R.menu.optionmenu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        lateinit var toastText : String

        when (item.itemId){
            R.id.about -> toastText = "About"
            R.id.setting -> toastText = "Setting"
            R.id.help -> toastText = "Help"
        }
        val toast : Toast = Toast.makeText( applicationContext, toastText,Toast.LENGTH_SHORT)
        toast.show()
        return true
    }
}