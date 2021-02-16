package com.example.pam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*

class Activity2 : AppCompatActivity() {

private var data02 : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)



        Btn2.setOnClickListener{
            if(TextUtils.isEmpty(data2.text.toString().trim())) {
                Toast.makeText(this, "Enter something", Toast.LENGTH_SHORT).show()
            } else {
                Intent(this, MainActivity::class.java).also{
                    it.putExtra("data from second screen", data2.text.toString().trim())
                    startActivity(it)
                }

            }
        }

        intent?.let{
            data02 = it.getStringExtra("data from first screen")
        }
        incoming_data_from_screen_1.text = data02

    }

}