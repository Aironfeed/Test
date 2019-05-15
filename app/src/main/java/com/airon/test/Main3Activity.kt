package com.airon.test

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        textView8.text = "05.02.18"
        button2.setOnClickListener {
            val news_next2 = Intent(this,MainActivity::class.java)
            startActivity(news_next2)
        }
    }

}
