package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.marketuygulamas.databinding.ActivityBilgilerBinding
import com.example.marketuygulamas.databinding.ActivityOdemeturuBinding

class odemeturu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odemeturu)
        //kapıda ödeme butonuna tıklandığında done classına gider
        val binding = ActivityOdemeturuBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        binding.btnkapida.setOnClickListener{
            intent= Intent(applicationContext,done::class.java)
            startActivity(intent)}
        //kredi kartıyla ödeme için
        binding.btnkredi.setOnClickListener{
            intent= Intent(applicationContext,done::class.java)
            startActivity(intent)}
    }
}