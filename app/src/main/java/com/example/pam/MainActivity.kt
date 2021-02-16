package com.example.pam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    private var data01 : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Btn.setOnClickListener{
            if(TextUtils.isEmpty(data1.text.toString().trim())) {
                Toast.makeText(this, "Enter something", Toast.LENGTH_SHORT).show()
            } else {
                Intent(this, Activity2::class.java).also{
                    it.putExtra("data from first screen", data1.text.toString().trim())
                    startActivity(it)
                }

            }
        }

        intent?.let{
            data01 = it.getStringExtra("data from second screen")
        }
        incoming_data_from_screen_2.text = data01


    }
}
