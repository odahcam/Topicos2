package com.odahcam.topicos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restaurant_details.*

class RestaurantDetailsActivity : AppCompatActivity() {

    companion object {
        const val PARAM_NOME_RESTAURANTE = "PARAM_PARKING_NAME"
        const val PARAM_NOME_USUARIO = "PARAM_PARKING_RATING"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_details)

        val nameRestaurant = intent.getStringExtra(PARAM_NOME_RESTAURANTE)

        textNomeRestaurante.text = nameRestaurant

        val nameUser = intent.getStringExtra(PARAM_NOME_USUARIO)

        if (!nameUser.isNullOrEmpty())
            textNomeUsuario.text = nameUser
    }

}
