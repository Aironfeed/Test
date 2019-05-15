package com.airon.test

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        textView5.text = "07.03.18"
        button3.setOnClickListener {
            val news_next2 = Intent(this,MainActivity::class.java)
            startActivity(news_next2)
        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.run {

            putString("KEY1",textView5.text.toString())

        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)


        textView5.text = savedInstanceState?.getString("KEY1")

    }
}
