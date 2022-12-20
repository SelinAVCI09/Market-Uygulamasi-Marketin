package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.marketuygulamas.databinding.ActivityKirazBinding
import com.example.marketuygulamas.databinding.ActivityMeyveBinding

class kiraz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kiraz)
        val binding = ActivityKirazBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view = binding.root
        setContentView(view)

        //butona tıklandığında sepete gitmesi
        binding.button4.setOnClickListener{
            intent= Intent(applicationContext,liste1::class.java)
            startActivity(intent)
        }

    }
}