package com.aiden.wordapp

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.aiden.wordapp.databinding.FragmentWordLayoutBinding

class LetterListFragment : Fragment() {

    private var _binding: FragmentWordLayoutBinding? = null
    private val binding get() = _binding!!


    private lateinit var recyclerView: RecyclerView



}