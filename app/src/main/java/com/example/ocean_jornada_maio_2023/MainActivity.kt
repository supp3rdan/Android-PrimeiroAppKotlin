package com.example.ocean_jornada_maio_2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val etTexto = findViewById<EditText>(R.id.etTexto)
        var texto = ""

        // Alterando quando o botao for clicado
        btEnviar.setOnClickListener {
            texto = etTexto.getText().toString()
            // Erro caso o editText esteja vazio
            if(texto.equals("")){
                etTexto.error = "Digite um nome"
            }else {
                tvResultado.setText(texto)
            }

        }

    }


}