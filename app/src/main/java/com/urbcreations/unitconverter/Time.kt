package com.urbcreations.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.urbcreations.unitconverter.R

class Time : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time)

        val mTohr = findViewById<EditText>(R.id.et_mTohr)
        val convertTohr = findViewById<Button>(R.id.converttohr)
        val time_ans = findViewById<TextView>(R.id.time_ans1)

        val hrTom = findViewById<EditText>(R.id.et_hrTom)
        val convertTomin = findViewById<Button>(R.id.cobvertmin)
        val time_ans2 = findViewById<TextView>(R.id.timee_ans2)

        convertTohr.setOnClickListener {
            var number: Double=0.0
            val et:String = mTohr.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                mTohr.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number = mTohr.text.toString().toDouble()

                var ans = number / 60.0
                Log.e("ans", ans.toString())

                time_ans.setText(ans.toString())

            }
        }

        convertTomin.setOnClickListener {
            var number: Double= 0.0
            val et:String = hrTom.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                hrTom.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number= hrTom.text.toString().toDouble()

            var ans= number*60.0

            time_ans2.setText(ans.toString())

        }


    }
}
}