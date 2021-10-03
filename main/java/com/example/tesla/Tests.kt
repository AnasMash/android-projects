package com.example.tesla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tests.*

class Tests : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tests)

        sobhan.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        log_in.setOnClickListener {
            startActivity(Intent(this,LogIn::class.java))
        }
        tfo.setOnClickListener {
            startActivity(Intent(this,tfo_alick::class.java))
        }
        theList.setOnClickListener {
            startActivity(Intent(this,List::class.java))
        }
    }
}