package com.example.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list.*

class List : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_list)
		var strings = resources.getStringArray(R.array.spinnerList)
		var theAdapter = ArrayAdapter(this,R.layout.spinner_design,strings)
		list.adapter = theAdapter
		list.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
			override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
				toast(strings[p2])
			}

			override fun onNothingSelected(p0: AdapterView<*>?) {
				TODO("Not yet implemented")
			}

		}
	}
	fun toast(text1:String){
		Toast.makeText(this, text1, Toast.LENGTH_SHORT).show()
	}
}