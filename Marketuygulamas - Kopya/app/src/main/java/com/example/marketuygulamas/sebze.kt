package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marketuygulamas.databinding.ActivityMeyveBinding
import com.example.marketuygulamas.databinding.ActivitySebzeBinding

class sebze : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sebze)
        setContentView(R.layout.activity_meyve)
        val binding = ActivitySebzeBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        //clasları değiştirmem lazım
        //domates için
        binding.btndomates.setOnClickListener{
            intent= Intent(applicationContext,domates::class.java)
            startActivity(intent)}
        //biber için
        binding.btnbiber.setOnClickListener{
            intent= Intent(applicationContext,biber::class.java)
            startActivity(intent)}
        //limon için
        binding.btnlimon.setOnClickListener{
            intent= Intent(applicationContext,limon::class.java)
            startActivity(intent)}
        //havuc için
        binding.btnhavuc.setOnClickListener{
            intent= Intent(applicationContext,havuc::class.java)
            startActivity(intent)}
    }
}