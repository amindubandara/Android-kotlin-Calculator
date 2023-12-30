package com.example.cw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class TempFrg (val celcious:Double) : Fragment() {

    private lateinit var lblAnswertemputure:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_temp_frg, container, false)
        lblAnswertemputure=view.findViewById(R.id.lblAnswertemputure)
        lblAnswertemputure.setText("Answer Farengeight to Celcious :${celcious}")
        return view
    }


}