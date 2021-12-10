package com.dicoding.screeningtestapp.ui.guest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dicoding.screeningtestapp.abstractfile.BaseRecyclerViewAdapter
import com.dicoding.screeningtestapp.abstractfile.BaseViewHolder
import com.dicoding.screeningtestapp.databinding.ItemEventBinding
import com.dicoding.screeningtestapp.databinding.ItemGuestBinding
import com.dicoding.screeningtestapp.extension.glide
import com.dicoding.screeningtestapp.model.Event
import com.dicoding.screeningtestapp.model.Guest

class GuestAdapter :
    BaseRecyclerViewAdapter<GuestAdapter.GuestViewHolder>() {

    private var listData = mutableListOf<Guest>()

    lateinit var onClick: (data: Guest) -> Unit
    fun submitList(newList: List<Guest>) {
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    inner class GuestViewHolder(itemView: ItemGuestBinding) :
        BaseViewHolder<Guest, ItemGuestBinding>(itemView) {
        override fun bind(data: Guest) {
            with(binding) {
                tvGuestName.text = data.name
                tvBirthDate.text = data.birth

                binding.root.setOnClickListener {
                    onClick.invoke(data)
                }
            }
        }

    }

    override val holderInflater: (LayoutInflater, ViewGroup, Boolean) -> GuestAdapter.GuestViewHolder
        get() = { inflater, viewGroup, boolean ->
            GuestViewHolder(ItemGuestBinding.inflate(inflater, viewGroup, boolean))
        }

    override fun onBindViewHolder(holder: GuestAdapter.GuestViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    fun setOnClickData(onClick: (data: Guest) -> Unit) {
        this.onClick = onClick
    }
}