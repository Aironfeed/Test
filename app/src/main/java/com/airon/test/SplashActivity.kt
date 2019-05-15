package com.airon.test

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        val bagraund = object : Thread(){
            override fun run(){
                try {
                    Thread.sleep(5000)

                    val intent =  Intent(baseContext,MainActivity::class.java)
                    startActivity(intent)
                }catch (e:Exception){
                    e.printStackTrace()
                }
            }
        }
        bagraund.start()
    }
}