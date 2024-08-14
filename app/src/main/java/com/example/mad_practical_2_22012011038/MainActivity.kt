package com.example.mad_practical_2_22012011038

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onStart(){
        super.onStart()
        val text = "onStart function called"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(this, text, duration) // in Activity
        toast.show()
    }
    override fun onResume() {
        super.onResume()
        Snackbar.make(
            findViewById(R.id.main),
            "onResume function called",
            Snackbar.LENGTH_SHORT
        ).show()
    }
}