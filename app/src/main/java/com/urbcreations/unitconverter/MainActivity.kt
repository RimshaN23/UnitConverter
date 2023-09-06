package com.urbcreations.unitconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.urbcreations.unitconverter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weight = findViewById<CardView>(R.id.cv_weight)
        val length = findViewById<CardView>(R.id.cv_length)
        val volume = findViewById<CardView>(R.id.cv_volume)
        val time = findViewById<CardView>(R.id.cv_time)
        val data = findViewById<CardView>(R.id.cv_data)
        val temprature = findViewById<CardView>(R.id.cv_temp)


        weight.setOnClickListener {
         val t=   Toast.makeText(this,"successful", Toast.LENGTH_SHORT)
           // t.show()
            val intent= Intent(this, Weight::class.java)
            startActivity(intent)
        }
        length.setOnClickListener {
          val t =  Toast.makeText(this,"successful", Toast.LENGTH_SHORT)
           // t.show()
            val intent= Intent(this, Length::class.java)
            startActivity(intent)
        }
        volume.setOnClickListener {
            Toast.makeText(this,"successful", Toast.LENGTH_SHORT)
            val intent= Intent(this, Volume::class.java)
            startActivity(intent)
        }
        data.setOnClickListener {
            Toast.makeText(this,"successful", Toast.LENGTH_SHORT)
            val intent= Intent(this, Data::class.java)
            startActivity(intent)
        }
        temprature.setOnClickListener {
            Toast.makeText(this,"successful", Toast.LENGTH_SHORT)
            val intent= Intent(this, Temprature::class.java)
            startActivity(intent)
        }
        time.setOnClickListener {
            Toast.makeText(this,"successful", Toast.LENGTH_SHORT)
            val intent= Intent(this, Time::class.java)
            startActivity(intent)
        }
    }
}