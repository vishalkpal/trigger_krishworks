package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_readdata.*

class readdata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_readdata)

        show_alldata.setOnClickListener {
            var alldata = "https://v1.nocodeapi.com/vishalkpal/google_sheets/DIFEMYRDMbXLnReE?tabId=Sheet1";
            Log.d("read data","$alldata")
        }
        search_data.setOnClickListener {
            var key = findViewById(R.id.key) as EditText
            var value = findViewById(R.id.value) as EditText
            var url = "https://v1.nocodeapi.com/vishalkpal/google_sheets/DIFEMYRDMbXLnReE/search?tabId=Sheet1&searchKey="+key.getText()+"&searchValue="+value.getText();
            Log.d("show url","$url")
        }
    }
}