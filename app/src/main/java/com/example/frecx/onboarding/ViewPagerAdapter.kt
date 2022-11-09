package com.example.frecx.onboarding

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.frecx.R
import com.example.frecx.databinding.IntroItemBinding

class ViewPagerAdapter(private val introList: List<Intro>)
    :RecyclerView.Adapter<ViewPagerAdapter.IntroViewHolder>() {

    inner class IntroViewHolder(private val binding: IntroItemBinding)
        :RecyclerView.ViewHolder(binding.root){
        fun bindItem(intro: Intro){
            binding.iconIv.setImageResource(intro.photo)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {

        return IntroViewHolder(
            IntroItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false)
        )
    }

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {
        holder.bindItem(introList[position])
    }

    override fun getItemCount(): Int {
        return introList.size
    }


}