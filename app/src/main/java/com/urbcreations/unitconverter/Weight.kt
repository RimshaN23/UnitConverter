package com.urbcreations.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.urbcreations.unitconverter.R

class Weight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)

        val gramTokg = findViewById<EditText>(R.id.et_gToKg)
        val convertTokg = findViewById<Button>(R.id.converttoKg)
        val weianswer1ght = findViewById<TextView>(R.id.weight_ans1)

        val kgTogram = findViewById<EditText>(R.id.et_kgTog)
        val convertTog = findViewById<Button>(R.id.cobverttog)
        val weianswer1ght2 = findViewById<TextView>(R.id.weight_ans2)

        convertTokg.setOnClickListener {
            var number: Double=0.0

            val et:String = gramTokg.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                gramTokg.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number = gramTokg.text.toString().toDouble()

                var ans = number / 1000.0
                Log.e("ans", ans.toString())

                weianswer1ght.setText(ans.toString())
            }

        }
        convertTog.setOnClickListener {
            var number: Double= 0.0
            val et:String = kgTogram.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                kgTogram.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number= kgTogram.text.toString().toDouble()

            var ans= number*1000.0

            weianswer1ght2.setText(ans.toString())

        }
        }

    }
}