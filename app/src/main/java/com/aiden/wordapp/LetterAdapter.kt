package com.aiden.wordapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aiden.wordapp.databinding.ItemViewBinding

class LetterAdapter : RecyclerView.Adapter<LetterAdapter.LetterViewHolder>() {


    private val list = ('A').rangeTo('Z').toList()


    inner class LetterViewHolder(private val itemBinding: ItemViewBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

            fun bind(letter:Char) {
                itemBinding.buttonItem.text =letter.toString()
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LetterViewHolder {
        val itemBinding =
            ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LetterViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: LetterViewHolder, position: Int) {
        val currentLetter = list[position]
        holder.bind(currentLetter)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}