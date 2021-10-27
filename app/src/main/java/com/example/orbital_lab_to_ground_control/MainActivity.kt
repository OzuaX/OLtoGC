package com.example.orbital_lab_to_ground_control

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<TextView>(R.id.etNome)
        val btEnviar = findViewById<Button>(R.id.btEnviar)

        btEnviar.setOnClickListener {
            if (etNome.text.isNotBlank()) {
                tvResultado.text = getString(R.string.hello_name, etNome.text.toString())
//                tvResultado.text = "Sim! ${etNome.text}!   "
            }else{
                etNome.error = getString(R.string.type_here)
            }
        }
    }
}