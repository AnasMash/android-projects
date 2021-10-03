package com.example.tesla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //المسبحة الإلكترونية
        plus.setOnClickListener {
            val number = num1.text.toString()
            val newNum = number.toInt() + 1
            if (newNum == 50){
                num1.text = "0"
            }else{
                num1.text = newNum.toString()
            }
        }
        clear.setOnClickListener{
            num1.text = "0"
        }
        save.setOnClickListener {
//            toast(num1.text.toString())
//            snackpar(num1.text.toString())
            val intent = Intent(this,LogIn::class.java)
            intent.putExtra("count",num1.text.toString())
            startActivity(intent)
        }
        //المسبحة الإلكترونية

        //spinner MainActivity مسبحة
        val data = resources.getStringArray(R.array.spinnerList)
        val aa1 = ArrayAdapter(this,android.R.layout.simple_spinner_item,data)
        spinner1.adapter = aa1
        spinner1.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val x = data[p2] // + toast("item selected sucesfully")
                num1.text = x
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
    }


    //ready funs
    fun toast(text1:String){
        Toast.makeText(this, text1, Toast.LENGTH_SHORT).show()
    }
    fun snackpar(text2:String){
        Snackbar.make(findViewById(R.id.lin1),text2,Snackbar.LENGTH_LONG).show()
    }
}