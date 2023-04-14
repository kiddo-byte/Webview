package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity5 : AppCompatActivity() {

    lateinit var WebD:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website5)

        WebD = findViewById(R.id.dWeb)

        val webSettings = WebD.settings
        webSettings.javaScriptEnabled = true
        WebD.loadUrl("https://www.nationalbank.co.ke/")
    }
}