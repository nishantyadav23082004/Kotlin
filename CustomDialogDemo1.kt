package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomDialogDemo1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_dialog_demo1)
        val custom = findViewById<Button>(R.id.customButton)
        custom.setOnClickListener {
            val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_box_layout, null)
            val b = AlertDialog.Builder(this).setView(dialogView)
            b.setPositiveButton("Subscribe") { dialog, _ ->
                val e = dialogView.findViewById<EditText>(R.id.editTextTextEmailAddress)
                val email = e.text.toString()
                if (email.isNotBlank()) {
                    Toast.makeText(this, "You have subscribed to the newsletter", Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"Please enter your email",Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            b.setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            b.create()
            b.show()
        }
    }
}
