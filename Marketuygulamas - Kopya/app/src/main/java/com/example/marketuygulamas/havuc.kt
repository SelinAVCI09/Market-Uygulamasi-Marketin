package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.marketuygulamas.databinding.ActivityBiberBinding
import com.example.marketuygulamas.databinding.ActivityHavucBinding

class havuc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_havuc)
        val binding = ActivityHavucBinding.inflate(layoutInflater)

        //binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)

        //butona tıklandığında sepete gitmesi
        binding.button5.setOnClickListener{
            intent= Intent(applicationContext,liste1::class.java)
            startActivity(intent)
        }
}
}