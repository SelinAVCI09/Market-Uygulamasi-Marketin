package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marketuygulamas.databinding.ActivityMaingirissayfasi2Binding
import com.example.marketuygulamas.databinding.ActivityMeyveBinding

class meyve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meyve)
        val binding = ActivityMeyveBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)


        //karpuz için
        binding.btnkarpuz.setOnClickListener{
            intent= Intent(applicationContext,karpuz::class.java)
            startActivity(intent)}
        //elma için
        binding.btnelma.setOnClickListener{
            intent= Intent(applicationContext,elma::class.java)
            startActivity(intent)}
        //kiraz için
        binding.btnkiraz.setOnClickListener{
            intent= Intent(applicationContext,kiraz::class.java)
            startActivity(intent)}
        //çilek için
        binding.btncilek.setOnClickListener{
            intent= Intent(applicationContext,cilek::class.java)
            startActivity(intent)}
    }
}