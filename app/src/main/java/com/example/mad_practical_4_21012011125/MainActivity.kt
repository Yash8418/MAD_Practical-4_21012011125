 package com.example.mad_practical_4_21012011125

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        val login:Button=findViewById(R.id.login)
//        login.setOnClickListener{
//            intent(this@MainActivity,LoginActivity::class.java).also{startActivity(intent)}
//        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

     fun loginClick(view: View){
         val intent= Intent(this,LoginActivity::class.java)
         startActivity(intent)

     }
}