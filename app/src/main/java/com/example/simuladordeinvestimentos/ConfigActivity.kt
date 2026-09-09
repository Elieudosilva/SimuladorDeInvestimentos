package com.example.simuladordeinvestimentos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfigActivity : AppCompatActivity() {

    private lateinit var buttonCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_config)

        buttonCalcular = findViewById(R.id.btnCalcularInvestimento)

        buttonCalcular.setOnClickListener {

            val intent = Intent(this, ResultActivity::class.java)

            startActivity(intent)
        }
    }
}