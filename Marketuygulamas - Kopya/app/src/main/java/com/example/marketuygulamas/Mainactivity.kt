package com.example.marketuygulamas

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.marketuygulamas.databinding.ActivityMainBinding

class Mainactivity : AppCompatActivity() {

lateinit var binding: ActivityMainBinding
lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //butona tıklandığında diğer sayfaya geçiş
        binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        preferences=getSharedPreferences("bilgiler", MODE_PRIVATE)

        binding.btngirisyap.setOnClickListener{


            //KAYITLI OLAN VERİLER
            var kayitlikullanıcı=preferences.getString("kullanici","")
            var kayitliparola=preferences.getString("sifre","")

            //GİRİLEN VERİLER
            var giriskullanici=binding.giriskaullaniciadi.text.toString()
            var girisparola=binding.girisparola.text.toString()
            if ((kayitlikullanıcı==giriskullanici)&&(kayitliparola==girisparola)){

                intent= Intent(applicationContext,Maingirissayfasi2::class.java)
                startActivity(intent)
                preferences=getSharedPreferences("bilgiler", MODE_PRIVATE)

                //üst kısma market uygulamasının başlangıcı çıkacak
            }
            else{
                Toast.makeText(applicationContext,"Giriş bilgileri hatalıdır",Toast.LENGTH_LONG).show()
            }
        }

        binding.btnkayitol.setOnClickListener{
            intent= Intent(applicationContext,MainKayitOl::class.java)
           startActivity(intent)
        }




    }
}