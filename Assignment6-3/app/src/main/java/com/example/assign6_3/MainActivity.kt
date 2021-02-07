package com.example.assign6_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Clear = Toast.makeText(applicationContext,"All fields are cleared.", Toast.LENGTH_LONG)
        var Sumall:Double
        var SumInter:Double
        var year1:Double = 0.00
        var year2:Double = 0.00
        var year3:Double = 0.00
        var inter1:Double
        var inter2:Double
        var inter3:Double

        buttoncal.setOnClickListener(){
            val b = tmoney1.getText().toString().toDouble()
            for (z in 1..10){
                if (z >= 1 && z <= 3){
                    inter1 = b * 3 / 100
                    year1 = year1 + inter1
                    inter1 = 0.00
                    tyear1.setText("$year1")
                }else if (z >= 4 && z <= 7){
                    inter2 = b * 5 / 100
                    year2 = year2 + inter2
                    inter2 = 0.00
                    tyear2.setText("$year2")
                }else if (z >= 8 && z <= 10){
                    inter3 = b * 7 / 100
                    year3 = year3 + inter3
                    inter3 = 0.00
                    tyear3.setText("$year3")
                }
            }
            SumInter = year1 + year2 + year3
            Sumall = b + SumInter
            tsum1.setText("$SumInter")
            tsum2.setText("$Sumall")
        }
        buttonclear.setOnClickListener(){
            tmoney1.setText(null)
            tyear1.setText(null)
            tyear2.setText(null)
            tyear3.setText(null)
            tsum1.setText(null)
            tsum2.setText(null)
            Clear.show()
        }
    }
}