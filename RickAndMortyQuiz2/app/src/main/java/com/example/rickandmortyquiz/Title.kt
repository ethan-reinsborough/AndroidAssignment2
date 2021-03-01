package com.example.rickandmortyquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rickandmortyquiz.databinding.FragmentTitleBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment

class Title : Fragment() {

    lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)

        binding.btnPlay.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(TitleDirections.actionTitleToQuestionsFragment())
        }

        (activity as AppCompatActivity).supportActionBar?.title = getString(R.string.app_name)

        return binding.root
    }
}