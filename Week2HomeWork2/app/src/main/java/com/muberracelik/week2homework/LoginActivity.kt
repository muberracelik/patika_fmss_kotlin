package com.muberracelik.week2homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muberracelik.week2homework.databinding.ActivityGetStartedBinding
import com.muberracelik.week2homework.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding
    private lateinit var signIntent : Intent
    private lateinit var backIntent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        signIntent = Intent(this,SignUpActivity::class.java)
        backIntent = Intent(this,GetStartedActivity::class.java)
        binding.createAccount.setOnClickListener(){
            startActivity(signIntent)
        }

        binding.ellipse.setOnClickListener(){
            startActivity(backIntent)
        }
    }


}