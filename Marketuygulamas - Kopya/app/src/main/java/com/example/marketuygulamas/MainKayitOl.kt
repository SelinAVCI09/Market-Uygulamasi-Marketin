package com.example.marketuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.marketuygulamas.databinding.ActivityMainKayitOlBinding

class MainKayitOl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =ActivityMainKayitOlBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnkaydet.setOnClickListener{
            var Kullanicibilgisi=binding.kayitkullanCAdi.text.toString()
            var Kullaniciparola=binding.kayitparola.text.toString()
            //adı bilgiler olan başka dosyaların erişemeyeceği bir xml dosyası oluşturdum
            var sharedPreferences=this.getSharedPreferences("bilgiler", MODE_PRIVATE)
            //verilerin güncellemek için bir editör ekledim
            var editor=sharedPreferences.edit()

            //veri ekleme
            editor.putString("kullanici","$Kullanicibilgisi").apply()
            editor.putString("sifre","$Kullaniciparola").apply()
            Toast.makeText(applicationContext,"Kayıt Başarılı", Toast.LENGTH_LONG).show()
            binding.kayitkullanCAdi.text.clear()
            binding.kayitparola.text.clear()
            //veri çıkarma


        }



        binding.btngirisedN.setOnClickListener{
            intent= Intent(applicationContext,Mainactivity::class.java)
            startActivity(intent)
    }
}
}