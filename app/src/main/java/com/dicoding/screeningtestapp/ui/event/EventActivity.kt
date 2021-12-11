package com.dicoding.screeningtestapp.ui.event

import android.content.Intent
import android.view.LayoutInflater
import com.dicoding.screeningtestapp.abstractfile.BaseActivityBinding
import com.dicoding.screeningtestapp.databinding.ActivityEventBinding
import com.dicoding.screeningtestapp.dummy.DummyData
import com.dicoding.screeningtestapp.ui.event.adapter.EventAdapter
import com.dicoding.screeningtestapp.ui.main.MainActivity

class EventActivity : BaseActivityBinding<ActivityEventBinding>() {

    private val eventAdapter = EventAdapter()

    override val bindingInflater: (LayoutInflater) -> ActivityEventBinding
        get() = { ActivityEventBinding.inflate(layoutInflater) }

    override fun setupView() {
        eventAdapter.submitList(DummyData.listEvent())
        setEventAdapter()

        binding.btnBack.setOnClickListener { onBackPressed() }
    }

    private fun setEventAdapter() {
        with(binding.rvEvent) {
            adapter = eventAdapter
            setHasFixedSize(true)

            eventAdapter.setOnClickData {
                setResult(
                    111,
                    Intent().putExtra(MainActivity.EXTRA_EVENT_NAME, it.name)
                )
                onBackPressed()
            }
        }
    }
}