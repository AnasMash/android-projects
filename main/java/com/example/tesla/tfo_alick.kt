package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_tfo_alick.*

class tfo_alick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tfo_alick)
        button.setOnClickListener {
            snackpar("تفو عليك يا ${editTextTextPersonName.text}")
            toast("تفو عليك يا ${editTextTextPersonName.text}")
        }
    }

    fun snackpar(text2:String){
        Snackbar.make(findViewById(R.id.lin3),text2, Snackbar.LENGTH_LONG).show()
    }
    fun toast(text1:String){
        Toast.makeText(this, text1, Toast.LENGTH_LONG).show()

    }
}