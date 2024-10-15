package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class implicitIntent1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent1)
        val url = findViewById<Button>(R.id.url)
        val nav = findViewById<Button>(R.id.nav)
        val cam = findViewById<Button>(R.id.cam)
        val cal = findViewById<Button>(R.id.cal)
        val con = findViewById<Button>(R.id.con)

        nav.setOnClickListener {
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(i1)
        }
        cam.setOnClickListener {
            val i2 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }
        cal.setOnClickListener {
            val i3 = Intent(Intent.ACTION_VIEW)
            i3.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i3)
        }
        con.setOnClickListener {
            val i4 = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i4)
        }
    }
}
