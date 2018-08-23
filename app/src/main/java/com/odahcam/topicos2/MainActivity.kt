package com.odahcam.topicos2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        attachButtonOnClickListener()
        attachButtonListViewOnClickListener()
    }


    fun openTranslateActivity() {
        val intent = Intent(this, TranslateActivity::class.java)
        startActivity(intent)
    }

    fun openListViewActivity() {
        val intent = Intent(this, ListViewActivity::class.java)
        startActivity(intent)
    }

    fun attachButtonOnClickListener() {

        val button = findViewById<Button>(R.id.buttonTranslate)

        button.setOnClickListener {
            openTranslateActivity()
        }
    }

    fun attachButtonListViewOnClickListener() {

        val button = findViewById<Button>(R.id.buttonListView)

        button.setOnClickListener {
            openListViewActivity()
        }
    }

}
