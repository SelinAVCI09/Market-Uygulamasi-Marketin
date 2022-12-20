package com.example.marketuygulamas

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.marketuygulamas.databinding.ActivityMaingirissayfasi2Binding

class Maingirissayfasi2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maingirissayfasi2)
        val binding = ActivityMaingirissayfasi2Binding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        //meyve içim
        binding.btnmeyve.setOnClickListener{
            intent= Intent(applicationContext,meyve::class.java)
            startActivity(intent)}
        //sebze için
        binding.btnsebze.setOnClickListener{
            intent= Intent(applicationContext,sebze::class.java)
            startActivity(intent)}
        //sepet için
        binding.imageButton16.setOnClickListener{
            intent= Intent(applicationContext,liste1::class.java)
            startActivity(intent)}
    }
}