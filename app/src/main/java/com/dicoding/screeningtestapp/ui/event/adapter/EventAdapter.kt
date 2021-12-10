package com.dicoding.screeningtestapp.ui.event.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.dicoding.screeningtestapp.abstractfile.BaseRecyclerViewAdapter
import com.dicoding.screeningtestapp.abstractfile.BaseViewHolder
import com.dicoding.screeningtestapp.databinding.ItemEventBinding
import com.dicoding.screeningtestapp.extension.glide
import com.dicoding.screeningtestapp.model.Event

class EventAdapter :
    BaseRecyclerViewAdapter<EventAdapter.EventViewHolder>() {

    private var listData = mutableListOf<Event>()

    lateinit var onClick: (data: Event) -> Unit
    fun submitList(newList: List<Event>) {
        listData.clear()
        listData.addAll(newList)
        notifyDataSetChanged()
    }

    inner class EventViewHolder(itemView: ItemEventBinding) :
        BaseViewHolder<Event, ItemEventBinding>(itemView) {
        override fun bind(data: Event) {
            with(binding) {
                data.image?.let { imgEvent.glide(itemView, it) }
                tvEventName.text = data.name
                tvEventDate.text = data.date

                binding.root.setOnClickListener {
                    onClick.invoke(data)
                }
            }
        }

    }

    override val holderInflater: (LayoutInflater, ViewGroup, Boolean) -> EventAdapter.EventViewHolder
        get() = { inflater, viewGroup, boolean ->
            EventViewHolder(ItemEventBinding.inflate(inflater, viewGroup, boolean))
        }

    override fun onBindViewHolder(holder: EventAdapter.EventViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

    fun setOnClickData(onClick: (data: Event) -> Unit) {
        this.onClick = onClick
    }
}