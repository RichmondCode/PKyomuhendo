package com.beteiserichmond.pkyomuhendo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_web_view_p_k.*

class WebViewPK : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_p_k)
        //val prog = findViewById<ProgressBar>(R.id.Progress1)
        //Progress1.visibility= View.VISIBLE
        val web = findViewById<WebView>(R.id.webviewpk)
        web.loadUrl("www.google.com")
        //Progress1.visibility = View.INVISIBLE
    }
}