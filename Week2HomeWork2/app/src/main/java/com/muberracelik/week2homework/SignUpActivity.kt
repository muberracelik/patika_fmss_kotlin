package com.muberracelik.week2homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muberracelik.week2homework.databinding.ActivityLoginBinding
import com.muberracelik.week2homework.databinding.ActivitySignInBinding

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignInBinding
    private lateinit var myIntent : Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myIntent = Intent(this,LoginActivity::class.java)

        binding.ellipse.setOnClickListener(){
            startActivity(myIntent)
        }
    }
}