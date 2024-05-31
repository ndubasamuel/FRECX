package com.example.frecx.ui.View

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.frecx.databinding.IntroItemBinding

class ViewPagerAdapter(private val introList: List<Intro>) :RecyclerView.Adapter<ViewPagerAdapter.IntroViewHolder>() {

    inner class IntroViewHolder(private val binding: IntroItemBinding) :RecyclerView.ViewHolder(binding.root){
        fun bindItem(intro: Intro){
            binding.iconIv.setImageResource(intro.photo)
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        return IntroViewHolder(IntroItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        holder.bindItem(introList[position])
    }

    override fun getItemCount(): Int {
        return introList.size
    }


}