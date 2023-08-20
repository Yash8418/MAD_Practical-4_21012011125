 package com.example.mad_practical_4_21012011125
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login:Button=findViewById(R.id.login)
        login.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java).also { startActivity(intent) }
        }
        val signup:Button=findViewById(R.id.signup)
        signup.setOnClickListener {
            intent = Intent(this, RegistrationActivity::class.java).also { startActivity(intent) }
        }
    }
}