package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class appchooser : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchooser)
        val button1 = findViewById<Button>(R.id.send1)
        button1.setOnClickListener {
            shareText("this text is being shared")
        }
    }

    private fun shareText(s: String) {
        var send: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, s)
            type = "text/plain"
        }
        var i: Intent = Intent.createChooser(send,"share text via")
        startActivity(i)
    }
}
