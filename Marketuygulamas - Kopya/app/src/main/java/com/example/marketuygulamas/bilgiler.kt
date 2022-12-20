package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marketuygulamas.databinding.ActivityBilgilerBinding
import com.example.marketuygulamas.databinding.ActivityMeyveBinding

class bilgiler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bilgiler)
        //adres butonuna tıklandığında done classına gider
        val binding = ActivityBilgilerBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        binding.btnadres.setOnClickListener{
            intent= Intent(applicationContext,odemeturu::class.java)
            startActivity(intent)}
    }
}