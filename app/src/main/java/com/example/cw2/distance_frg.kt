package com.example.cw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView


class distance_frg(val km:Double) : Fragment() {

    private lateinit var lblAnswerdistance:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=  inflater.inflate(R.layout.fragment_distance_frg, container, false)
        lblAnswerdistance=view.findViewById(R.id.lblAnswerdistance)
        lblAnswerdistance.setText("Distance Km to m:${km}")
        return view
    }


}