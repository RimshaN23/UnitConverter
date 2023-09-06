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

class Volume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        val lToMl = findViewById<EditText>(R.id.et_lToMl)
        val convertToMl = findViewById<Button>(R.id.converttoMl)
        val vol_ans1 = findViewById<TextView>(R.id.volume_ans1)

        val MlTol = findViewById<EditText>(R.id.et_MlTol)
        val convertTol = findViewById<Button>(R.id.cobverttol)
        val vol_ans2 = findViewById<TextView>(R.id.volume_ans2)

        convertToMl.setOnClickListener {
            var number: Double=0.0
            val et:String = lToMl.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                lToMl.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number = lToMl.text.toString().toDouble()

                var ans = number / 1000.0
                Log.e("ans", ans.toString())

                vol_ans1.setText(ans.toString())

            }
        }

        convertTol.setOnClickListener {
            var number: Double= 0.0
            val et:String = MlTol.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }


            else {
                MlTol.onEditorAction(EditorInfo.IME_ACTION_DONE)


                number = MlTol.text.toString().toDouble()

                var ans = number * 1000.0

                vol_ans2.setText(ans.toString())
            }
        }


    }
}