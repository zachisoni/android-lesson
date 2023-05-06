package com.example.asad_ti4b.adapter

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import com.example.asad_ti4b.data.Alumni

class AlumniAdapter(context : Context, resource : Int) : ArrayAdapter<Alumni>(context, resource) {
    lateinit var context : Context
    var resource : Int = 0
    init{
        this.context = context
        this.resource = resource
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var holder :Holder
        var viewItemData = convertView

        if(viewItemData == null){
            holder = Holder()

            viewItemData = LayoutInflater.from(context).inflate(resource, parent, false)
            holder.txtNama = viewItemData.findViewById(R.id.txtNama)

        } else {

        }

        return super.getView(position, convertView, parent)
    }

    class Holder{
        lateinit var txtNama : EditText
        lateinit var txtPekerjaan : EditText
    }
}