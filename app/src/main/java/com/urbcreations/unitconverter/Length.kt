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

class Length : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length)

        val mTokm = findViewById<EditText>(R.id.et_mToKm)
        val convertTokm = findViewById<Button>(R.id.converttoKm)
        val lengthanswer1 = findViewById<TextView>(R.id.lenght_ans1)

        val kmTom = findViewById<EditText>(R.id.et_kmTom)
        val convertTom = findViewById<Button>(R.id.cobverttom)
        val len_ans2 = findViewById<TextView>(R.id.lenght_ans2)

        convertTokm.setOnClickListener {
            var number: Double=0.0
            val et:String = mTokm.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                mTokm.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number = mTokm.text.toString().toDouble()

                var ans = number / 1000.0
                Log.e("ans", ans.toString())

                lengthanswer1.setText(ans.toString())
            }

        }

        convertTom.setOnClickListener {
            var number: Double = 0.0
            val et: String = kmTom.text.toString()
            Log.e("anss", et)

            if (et.isEmpty()) {
                Log.e("ans", et)

                val t = Toast.makeText(this, "enter number", Toast.LENGTH_SHORT)
                t.show()

            } else {
                kmTom.onEditorAction(EditorInfo.IME_ACTION_DONE)


                number = kmTom.text.toString().toDouble()

                var ans = number * 1000.0

                len_ans2.setText(ans.toString())

            }


        }
    }
}
