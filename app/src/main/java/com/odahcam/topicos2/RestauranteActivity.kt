package com.odahcam.topicos2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_detalhes_restaurante.*
import kotlinx.android.synthetic.main.activity_main.*

class RestauranteActivity : AppCompatActivity() {

    companion object {
        const val PARAM_NOME_RESTAURANTE = "PARAM_NOME_RESTAURANTE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_restaurante)

        val nomeRestaurante = intent.getStringExtra(PARAM_NOME_RESTAURANTE)

        textNomeRestaurante.setText(nomeRestaurante)
    }

}
