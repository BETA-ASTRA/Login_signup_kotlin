package com.example.finalone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val button=findViewById<Button>(R.id.button1)
       button.setOnClickListener{
           val intent= Intent(this,SignupActivity::class.java)
           startActivity(intent)
       }
    }
}