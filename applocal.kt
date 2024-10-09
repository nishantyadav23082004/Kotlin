package com.example.myapplication

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class applocal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_applocal)
        var btnEng = findViewById<Button>(R.id.english)
        var btnHindi = findViewById<Button>(R.id.hindi)
        btnEng.setOnClickListener {
            setLocale("en")
        }
        btnHindi.setOnClickListener {
            setLocale("hi")
        }
    }
    
    private fun setLocale(langCode: String){
        // Check if the  current locale is different before applying the new one
        val currentLang = resources.configuration.locales.get(0).language
        if(langCode != currentLang) {
            val l = Locale(langCode)
            Locale.setDefault(l)
            val c = Configuration(resources.configuration)
            c.setLocale(l)
            resources.updateConfiguration(c, resources.displayMetrics)
        }         
        recreate()
    }
}
