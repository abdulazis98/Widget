package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget.databinding.ActivityMainBinding
import com.example.widget.databinding.ActivityWidgetBinding

//membuat variabel binding
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)


        val getData = intent.getParcelableExtra<modelLogin>("data")
        binding.txtUsername.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()

        //Explicit intent
        binding.btnIntentWidget.setOnClickListener {
            val intent = Intent(this, Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent(this, ImplicitIntent::class.java)
            startActivity(intent)
        }

    }
}