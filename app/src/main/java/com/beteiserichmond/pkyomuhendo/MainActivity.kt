package com.beteiserichmond.pkyomuhendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bttn = findViewById<Button>(R.id.Bttnpk)
        bttn.setOnClickListener {
            startActivity(Intent(this, CreateAccount::class.java))
        }

        val bttn2 = findViewById<Button>(R.id.Bttnpk3)
        bttn2.setOnClickListener {
            startActivity(Intent(this, WebViewPK::class.java))
        }


    }
}