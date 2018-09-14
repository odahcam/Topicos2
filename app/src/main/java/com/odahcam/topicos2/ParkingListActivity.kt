package com.odahcam.topicos2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_parking_list.*

class ParkingListActivity : AppCompatActivity() {

    // Initializing an empty ArrayList to be filled with animals
    private val listItems: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_list)

        // Loads animals into the ArrayList
        addListItems()

        parkingListView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, this.listItems)

        parkingListView.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this, ParkingDetailsActivity::class.java)
                    .putExtra(ParkingDetailsActivity.PARAM_PARKING_NAME, listItems[i])
                    .putExtra(ParkingDetailsActivity.PARAM_PARKING_RATING, listItems[i])
                    .putExtra(ParkingDetailsActivity.PARAM_PARKING_CAPACITY, listItems[i])

            startActivity(intent)
        }
    }

    // Adds animals to the empty animals ArrayList
    private fun addListItems() {
        listItems.add("UNIFEBE's Parking (Estapar)")
        listItems.add("Cine Gracher's Parking")
        listItems.add("TIozinho do centro")
        listItems.add("Posto Padrão")
    }

}
