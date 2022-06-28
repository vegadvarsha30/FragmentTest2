package com.example.fragmenttest2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_, container, false)
        val textView = view.findViewById<TextView>(R.id.textViewFragment)
        val editText = view.findViewById<EditText>(R.id.editTextFragment)
        val button = view.findViewById<Button>(R.id.ClickButton)

        button.setOnClickListener {
            textView.text = editText.text.toString()
        }

        return view
    }
}