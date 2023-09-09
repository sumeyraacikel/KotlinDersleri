package com.example.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
       var mesaj:String? = null

       lateinit var yazi:String

       var sayi = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yazi = "Merhaba"



    }
}