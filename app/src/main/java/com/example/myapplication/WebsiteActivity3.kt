package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity3 : AppCompatActivity() {

    lateinit var WebB:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website3)

        WebB = findViewById(R.id.bWeb)

        val webSettings = WebB.settings
        webSettings.javaScriptEnabled = true
        WebB.loadUrl("https://www.sc.com/ke/")
    }
}