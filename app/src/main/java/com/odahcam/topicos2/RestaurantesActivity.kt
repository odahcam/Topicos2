package com.odahcam.topicos2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class RestaurantesActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with animals
    val listItems: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_restaurantes)

        // Loads animals into the ArrayList
        addListItems()

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.listItems)

        val listView = findViewById<ListView>(R.id.list_view)

        listView.adapter = adapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            startActivity(Intent(this, RestauranteActivity::class.java)
                    .putExtra(RestauranteActivity.PARAM_NOME_RESTAURANTE, listItems[i]))
        }
    }

    // Adds animals to the empty animals ArrayList
    fun addListItems() {
        listItems.add("Kako Lanches")
        listItems.add("Saragossa")
        listItems.add("Paloschi")
        listItems.add("Rio Branco")
        listItems.add("Top Burguer")
        listItems.add("Best Burguer")
        listItems.add("Bar do Beto")
    }

}
