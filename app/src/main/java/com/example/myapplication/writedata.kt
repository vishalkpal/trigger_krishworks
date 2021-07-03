package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_update.*
import kotlinx.android.synthetic.main.activity_writedata.*

class writedata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_writedata)

        insert_data.setOnClickListener {
            val insert_id = findViewById<TextView>(R.id.insert_id)
            val insert_name = findViewById(R.id.insert_name) as EditText
            val insert_marks =  findViewById(R.id.insert_marks) as EditText
            val insert_status = findViewById(R.id.insert_status) as TextView
            val url = ""
        }
    }
}