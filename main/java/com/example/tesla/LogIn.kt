package com.example.tesla

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_log_in.*

class LogIn : AppCompatActivity() {
    var gender:String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        if(intent.hasExtra("count")){
            et_name.setText(intent.getStringExtra("count"))

        }

        btn_save.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND)
            intent.type = "plain/text"
            intent.putExtra(Intent.EXTRA_TEXT,et_name.text.toString())
            startActivity(intent)
            //toast("${et_name.text} ${et_phone.text} ${et_age.text} ${et_address.text} $gender")
        }
        /////////////////////////////////////
        //spinner القائمة المنسدلة
        val data = resources.getStringArray(R.array.LogInSpinner)
        val spinnerAdapter2 = ArrayAdapter(this,R.layout.spinner_design,data)
        spinnerLogin.adapter = spinnerAdapter2
        //setONItemSelectedListener
        spinnerLogin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                toast(data[position]+" list")
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
        /////////////////////////////////////////////////////


        rg123.setOnCheckedChangeListener { group, i ->
            val radioGroup =  findViewById<RadioButton>(i)
            gender = radioGroup.text.toString()
            toast(radioGroup.text.toString())
        }

    }
    fun toast(text1:String){
        Toast.makeText(this, text1, Toast.LENGTH_LONG).show()

    }
}