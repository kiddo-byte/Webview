package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnequity:Button
    private lateinit var btnI:Button
    private lateinit var btnstandard:Button
    private lateinit var btnco:Button
    private lateinit var btnnational:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnequity = findViewById(R.id.buttoneq)
        btnI = findViewById(R.id.buttonI)
        btnstandard = findViewById(R.id.buttonstandard)
        btnco = findViewById(R.id.buttonco)
        btnnational = findViewById(R.id.buttonnational)

        btnequity.setOnClickListener {

            val gotowebsite = Intent(this,WebsiteActivity::class.java)
            startActivity(gotowebsite)

        }

        btnI.setOnClickListener {

            val gotoiandm = Intent(this,WebsiteActivity2::class.java)
            startActivity(gotoiandm)
        }

        btnstandard.setOnClickListener {

            val gotostandard = Intent(this,WebsiteActivity3::class.java)
            startActivity(gotostandard)
        }

        btnco.setOnClickListener {

            val gotocoop = Intent(this,WebsiteActivity4::class.java)
            startActivity(gotocoop)
        }

        btnnational.setOnClickListener {

            val gotonational = Intent(this,WebsiteActivity5::class.java)
            startActivity(gotonational)
        }
    }
}