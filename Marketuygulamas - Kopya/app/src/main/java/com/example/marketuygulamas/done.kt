package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marketuygulamas.databinding.ActivityDoneBinding
import com.example.marketuygulamas.databinding.ActivityOdemeturuBinding

class done : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        //anasayfa butonuna tıklandığında anasayfaya geriş dönüş için
        val binding = ActivityDoneBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        binding.btnanasayfa.setOnClickListener{
            intent= Intent(applicationContext,Maingirissayfasi2::class.java)
            startActivity(intent)}
    }
}