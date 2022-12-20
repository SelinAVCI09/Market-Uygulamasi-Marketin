package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.marketuygulamas.databinding.ActivityKarpuzBinding

class karpuz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_karpuz)
        val binding = ActivityKarpuzBinding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view = binding.root
        setContentView(view)


        //butona tıklayarak sepete geçiş
        binding.button.setOnClickListener{
            intent= Intent(applicationContext,liste1::class.java)
            startActivity(intent)
        }

    }
}

