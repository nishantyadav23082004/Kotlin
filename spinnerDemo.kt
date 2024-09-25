package com.example.ca1

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.ca1.databinding.ActivitySpinnerDemoBinding

class spinnerDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_spinner_demo)
        
        var spin = findViewById<Spinner>(R.id.spin)
        var options = arrayOf("login","home","settings")
        var a = ArrayAdapter(this,android.R.layout.simple_spinner_item,options)
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spin.adapter = a

        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ){
                when(position){
                    1 -> Toast.makeText(applicationContext,"hi",Toast.LENGTH_LONG).show()
                    2 -> Toast.makeText(applicationContext,"hi",Toast.LENGTH_LONG).show()
                    3 -> Toast.makeText(applicationContext,"hi",Toast.LENGTH_LONG).show()
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}
