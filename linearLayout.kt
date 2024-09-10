package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class unit2_linearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_unit2_linear_layout)
        var a = findViewById<EditText>(R.id.editText11)
        var c = findViewById<EditText>(R.id.editText22)
        var b = findViewById<Button>(R.id.button1)
        var d = findViewById<TextView>(R.id.textView11)
        b.setOnClickListener {
            var name = a.text.toString()
            var phone = c.text.toString()
            d.text = "My name is "+name+" and phone number is "+phone
        }

    }
}
