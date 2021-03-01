package com.example.rickandmortyquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity

class Rules : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Set ActionBar title to "The Rules"
        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.rules_title)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rules, container, false)
    }
}