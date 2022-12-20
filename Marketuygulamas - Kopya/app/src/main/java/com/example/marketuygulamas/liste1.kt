package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.example.marketuygulamas.databinding.ActivityListe1Binding


class liste1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liste1)
        val binding = ActivityListe1Binding.inflate(layoutInflater)

        // binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        setContentView(view)
        //adres butonuna gitmek için
        binding.button10.setOnClickListener{
            intent= Intent(applicationContext,bilgiler::class.java)
            startActivity(intent)}
        //domates için
        var num =0
        var artı =findViewById<TextView>(R.id.textView58)
        var b1=findViewById<ImageButton>(R.id.imageButton17)
        var b2=findViewById<ImageButton>(R.id.imageButton19)
        b1.setOnClickListener {
            num++
            artı.setText("$num")
        }
        b2.setOnClickListener {
            num--
            artı.setText("$num")
        }
        //biber için
        var num1 =0
        var artı1 =findViewById<TextView>(R.id.textView62)
        var b11=findViewById<ImageButton>(R.id.imageButton20)
        var b21=findViewById<ImageButton>(R.id.imageButton21)
        b11.setOnClickListener {
            num1++
            artı1.setText("$num1")
        }
        b21.setOnClickListener {
            num1--
            artı1.setText("$num1")
        }
        //limon için
        var num2 =0
        var artı2 =findViewById<TextView>(R.id.textView61)
        var b12=findViewById<ImageButton>(R.id.imageButton24)
        var b22=findViewById<ImageButton>(R.id.imageButton23)
        b12.setOnClickListener {
            num2++
            artı2.setText("$num2")
        }
        b22.setOnClickListener {
            num2--
            artı2.setText("$num2")
        }
        //havuç için
        var num3 =0
        var artı3 =findViewById<TextView>(R.id.textView63)
        var b13=findViewById<ImageButton>(R.id.imageButton22)
        var b23=findViewById<ImageButton>(R.id.imageButton41)
        b13.setOnClickListener {
            num3++
            artı3.setText("$num3")
        }
        b23.setOnClickListener {
            num3--
            artı3.setText("$num3")
        }
        // karpuz için
        var num4 =0
        var artı4 =findViewById<TextView>(R.id.textView65)
        var b14=findViewById<ImageButton>(R.id.imageButton42)
        var b24=findViewById<ImageButton>(R.id.imageButton43)
        b14.setOnClickListener {
            num4++
            artı4.setText("$num4")
        }
        b24.setOnClickListener {
            num4--
            artı4.setText("$num4")
        }
        //elma için
        var num5 =0
        var artı5 =findViewById<TextView>(R.id.textView67)
        var b15=findViewById<ImageButton>(R.id.imageButton45)
        var b25=findViewById<ImageButton>(R.id.imageButton46)
        b15.setOnClickListener {
            num5++
            artı5.setText("$num5")
        }
        b25.setOnClickListener {
            num5--
            artı5.setText("$num5")
        }
        //kiraz için
        var num6 =0
        var artı6 =findViewById<TextView>(R.id.textView68)
        var b16=findViewById<ImageButton>(R.id.imageButton47)
        var b26=findViewById<ImageButton>(R.id.imageButton48)
        b16.setOnClickListener {
            num6++
            artı6.setText("$num6")
        }
        b26.setOnClickListener {
            num6--
            artı6.setText("$num6")
        }
        //çilek için
        var num7 =0
        var artı7 =findViewById<TextView>(R.id.textView69)
        var b17=findViewById<ImageButton>(R.id.imageButton49)
        var b27=findViewById<ImageButton>(R.id.imageButton50)
        b17.setOnClickListener {
            num7++
            artı7.setText("$num7")
        }
        b27.setOnClickListener {
            num7--
            artı7.setText("$num7")
        }
    }
}