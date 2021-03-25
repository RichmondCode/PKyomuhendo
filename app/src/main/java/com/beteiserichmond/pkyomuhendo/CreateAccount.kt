package com.beteiserichmond.pkyomuhendo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        val bttn1 = findViewById<Button>(R.id.Bttnpk2)
        bttn1.setOnClickListener {
            startActivity(Intent(this, WebViewPK::class.java))
        }

    }
}