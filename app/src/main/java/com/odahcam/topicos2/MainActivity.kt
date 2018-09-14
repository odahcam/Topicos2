package com.odahcam.topicos2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnActivityOpener(findViewById(R.id.buttonTranslate), TranslateActivity::class.java)
        btnActivityOpener(findViewById(R.id.buttonListView), ListViewActivity::class.java)
        btnActivityOpener(findViewById(R.id.buttonRestaurantes), RestaurantListActivity::class.java)
        btnActivityOpener(findViewById(R.id.buttonParkings), ParkingListActivity::class.java)
    }

    private fun <TActivity> btnActivityOpener(btn: Button, activityClass: Class<TActivity>) {
        btn.setOnClickListener {
            openActivity(activityClass)
        }
    }

    private fun <TActivity> openActivity(activityClass: Class<TActivity>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }

}

