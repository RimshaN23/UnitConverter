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

class Data : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val bTokb = findViewById<EditText>(R.id.et_bToKb)
        val convertTokb = findViewById<Button>(R.id.converttoKb)
        val data_ans1 = findViewById<TextView>(R.id.data_ans1)

        val kbTob = findViewById<EditText>(R.id.et_kbTob)
        val convertTob = findViewById<Button>(R.id.cobverttob)
        val data_ans2 = findViewById<TextView>(R.id.data_ans2)

        convertTokb.setOnClickListener {
            var number: Double=0.0

            val et:String = bTokb.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                bTokb.onEditorAction(EditorInfo.IME_ACTION_DONE)
                number = bTokb.text.toString().toDouble()

                var ans = number / 1000.0
                Log.e("ans", ans.toString())

                data_ans1.setText(ans.toString())
            }

        }

        convertTob.setOnClickListener {
            var number: Double= 0.0
            val et:String = kbTob.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }

            else{
                kbTob.onEditorAction(EditorInfo.IME_ACTION_DONE)
            number= kbTob.text.toString().toDouble()

            var ans= number*1000.0

            data_ans2.setText(ans.toString())

        }
        }


    }
}