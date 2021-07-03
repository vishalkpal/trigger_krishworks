package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_manipilation.*

class manipilation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manipilation)
        button2.setOnClickListener {
            val intent = Intent(this,readdata::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent(this, writedata::class.java)
            startActivity(intent)
        }
        button8.setOnClickListener {
            val intent = Intent(this, update::class.java)
            startActivity(intent)
        }
    }
}