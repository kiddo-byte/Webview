package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity4 : AppCompatActivity() {

    lateinit var WebC:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website4)

        WebC = findViewById(R.id.cWeb)

        val webSettings = WebC.settings
        webSettings.javaScriptEnabled = true
        WebC.loadUrl("https://www.co-opbank.co.ke/")
    }
}