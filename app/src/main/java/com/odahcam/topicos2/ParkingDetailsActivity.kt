package com.odahcam.topicos2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_parking_details.*

class ParkingDetailsActivity : AppCompatActivity() {

    companion object {
        const val PARAM_PARKING_NAME = "PARAM_PARKING_NAME"
        const val PARAM_PARKING_RATING = "PARAM_PARKING_RATING"
        const val PARAM_PARKING_CAPACITY = "PARAM_PARKING_CAPACITY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parking_details)

        parkingName.text = intent.getStringExtra(PARAM_PARKING_NAME)
        parkingCapacity.text = intent.getStringExtra(PARAM_PARKING_RATING)
        parkingRating.text = intent.getStringExtra(PARAM_PARKING_CAPACITY)
    }

}
