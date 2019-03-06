package com.errorfoundtechnologies.intent_6th_mar_19

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1.setOnClickListener {
            var i = intent
            i = Intent(this@MainActivity,Main2Activity::class.java)
            startActivity(i)
        }

        bt2.setOnClickListener {

            var a =packageManager.getLaunchIntentForPackage("com.whatsapp")
                startActivity(a)
        }
    }
}
