package com.example.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            Toast.makeText(this, "Activity Created", Toast.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Activity Started", Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Activity Resumed", Toast.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Activity Paused", Toast.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "Activity Restarted", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Activity Destroyed", Toast.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Activity Stopped", Toast.LENGTH_LONG).show()
    }

}
