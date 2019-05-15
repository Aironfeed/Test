package com.airon.test

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView4.text = "07.03.18"
        textView4_2.text = "05.02.18"
        val text1 = textView2.text.trim().toString()
        val search = editText.text.trim().toString()
        val res = text1.compareTo (search, true)


        news.setOnClickListener {


            val news_next = Intent(this,Main2Activity::class.java)
            startActivity(news_next)

        }
        button.setOnClickListener {

            /*if (search.equals(text1,true)) {
                news1.visibility = LinearLayout.INVISIBLE
            }
            else{
                news.visibility = LinearLayout.INVISIBLE
            }*/
        }
        news1.setOnClickListener {

            val news_next1 = Intent(this,Main3Activity::class.java)
            startActivity(news_next1)

        }
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        outState?.run {

            putString("KEY1",textView4.text.toString())
            putString("KEY2",textView4_2.text.toString())
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)


        textView4.text = savedInstanceState?.getString("KEY1")
        textView4_2.text = savedInstanceState?.getString("KEY2")
    }


}
