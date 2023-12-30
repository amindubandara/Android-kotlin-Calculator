package com.example.cw2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class weight_frg (val weights:Double): Fragment() {
   private  lateinit var lblAnswerWeight:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View= inflater.inflate(R.layout.fragment_weight_frg, container, false)

        lblAnswerWeight=view.findViewById(R.id.lblAnswerWeight)
        lblAnswerWeight.setText("Answer(KG to G):${weights}g")
        return view
    }


}