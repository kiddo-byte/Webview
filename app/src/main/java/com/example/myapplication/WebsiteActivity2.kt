package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebsiteActivity2 : AppCompatActivity() {

    lateinit var WebA:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website2)

        WebA = findViewById(R.id.aWeb)

        val webSettings = WebA.settings
        webSettings.javaScriptEnabled = true
        WebA.loadUrl("https://www.imbankgroup.com/")
    }
}
