package com.example.cw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
   private lateinit var TxtValue:EditText
    private lateinit var btnTempr:Button
    private lateinit var btnWeights:Button
    private lateinit var btnDist:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTempr=findViewById(R.id.btnTemp)
        btnWeights=findViewById(R.id.btnWeight)
        btnDist=findViewById(R.id.btnDis)
        TxtValue=findViewById(R.id.TxtValue)

        val fragmentContainer=R.id.Constraint



        btnTempr.setOnClickListener {
            val farenheight:Double=TxtValue.text.toString().toDouble()
            val celcious:Double=(farenheight-32.00)*(5.00/9.00)
            val fragmentContainer=R.id.Constraint

            val frgmgr: FragmentManager =supportFragmentManager

            val fragmentTransaction: FragmentTransaction =frgmgr.beginTransaction()

            val fragment:TempFrg= TempFrg(celcious)

            fragmentTransaction.replace(fragmentContainer,fragment)

            fragmentTransaction.commit()

        }

        btnWeights.setOnClickListener {

            val Kilograms:Double=TxtValue.text.toString().toDouble()

            val grams:Double=Kilograms*1000
            val fragmentContainer=R.id.Constraint

            val frgmgr: FragmentManager =supportFragmentManager

            val fragmentTransaction: FragmentTransaction =frgmgr.beginTransaction()

            val fragment:weight_frg= weight_frg(grams)

            fragmentTransaction.replace(fragmentContainer,fragment)

            fragmentTransaction.commit()

        }

        btnDist.setOnClickListener {

            val kilometers:Double=TxtValue.text.toString().toDouble()
            val meters:Double=kilometers*1000
            val frgmgr: FragmentManager =supportFragmentManager
            val fragmentContainer=R.id.Constraint
            val fragmentTransaction: FragmentTransaction =frgmgr.beginTransaction()

            val fragment:distance_frg= distance_frg(meters)

            fragmentTransaction.replace(fragmentContainer,fragment)

            fragmentTransaction.commit()

        }



    }
}