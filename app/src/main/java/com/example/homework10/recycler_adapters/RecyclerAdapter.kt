package com.example.homework10.recycler_adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.homework10.ProfileDiffCallback
import com.example.homework10.data.Item

import com.example.homework10.databinding.ActivityItemBinding

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ProfileViewHolder>() {

  private var listOfItems: List<Item> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        return ProfileViewHolder(
            ActivityItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        holder.bind(listOfItems[position])
    }

    override fun getItemCount(): Int {
        return listOfItems.size
    }

    inner class ProfileViewHolder(private var binding: ActivityItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private val switch = binding.swtch

        fun bind(person: Item) {
            binding.apply {
                imgStartIcon.setImageResource(person.startIcon)
                tvText.text = person.text
                ivEndIcon.setImageResource(person.endIcon)
                if (person.isSwitchVisible) {
                    switch.isVisible = true
                }
            }
        }
    }
    fun submitList(newList: List<Item>) {
        val diffResult = DiffUtil.calculateDiff(ProfileDiffCallback(listOfItems, newList))
        this.listOfItems = newList
        diffResult.dispatchUpdatesTo(this)
    }
}