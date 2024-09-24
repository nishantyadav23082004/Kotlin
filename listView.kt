package com.example.ca1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        var data = findViewById<EditText>(R.id.editList)
        var add = findViewById<Button>(R.id.addToList)
        var dataList = findViewById<ListView>(R.id.dataList)
        var list = ArrayList<String>()

        // Adapters act as bridge between the xml file/widget and the kotlin data file

        var bridge: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,list)
        dataList.adapter = bridge

        add.setOnClickListener {
            var item = data.text.toString()
            if(item.isNotEmpty()){
                list.add(text)
                data.text.clear()
                bridge.notifyDataSetChanged()
            }
            else{
                Toast.makeText(this,"No data entered", Toast.LENGTH_LONG).show()
            }
        }
    }
}
