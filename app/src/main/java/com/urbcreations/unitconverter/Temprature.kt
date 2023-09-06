package com.urbcreations.unitconverter

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.urbcreations.unitconverter.R

class Temprature : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temprature)

        val et_CToF = findViewById<EditText>(R.id.et_CToF)
        val convertTof = findViewById<Button>(R.id.converttoF)
        val tempAns1 = findViewById<TextView>(R.id.temp_ans1)

        val FToc = findViewById<EditText>(R.id.et_FToC)
        val convertToc = findViewById<Button>(R.id.cobverttoC)
        val temp_ans2 = findViewById<TextView>(R.id.temp_ans2)

        convertTof.setOnClickListener {

            Log.e("ans", "et")

            var number: Int=0
            val et:String = et_CToF.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

         val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }
            
            else {
                et_CToF.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number = et_CToF.text.toString().toInt()
                var ans = (number * 9 / 5) + 32
                Log.e("ans", ans.toString())

                tempAns1.setText(ans.toString())
            }

        }

        convertToc.setOnClickListener {
            var number: Int= 0
            val et:String = FToc.text.toString()
            Log.e("anss", et)

            if (et.isEmpty() ) {
                Log.e("ans", et)

                val t=       Toast.makeText(this,"enter number", Toast.LENGTH_SHORT)
                t.show()

            }

            else
            {
                FToc.onEditorAction(EditorInfo.IME_ACTION_DONE)

                number = FToc.text.toString().toInt()

                var ans = (number - 32) * 5 / 9
                temp_ans2.setText(ans.toString())
            }
        }


    }
}