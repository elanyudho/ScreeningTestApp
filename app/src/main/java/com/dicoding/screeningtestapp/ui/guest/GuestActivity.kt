package com.dicoding.screeningtestapp.ui.guest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.viewModels
import com.dicoding.screeningtestapp.abstractfile.BaseActivityBinding
import com.dicoding.screeningtestapp.databinding.ActivityGuestBinding
import com.dicoding.screeningtestapp.extension.toast
import com.dicoding.screeningtestapp.model.Guest
import com.dicoding.screeningtestapp.ui.guest.adapter.GuestAdapter
import com.dicoding.screeningtestapp.ui.main.MainActivity

class GuestActivity : BaseActivityBinding<ActivityGuestBinding>() {

    private val guestAdapter = GuestAdapter()

    private val vm: GuestViewModel by viewModels()


    override val bindingInflater: (LayoutInflater) -> ActivityGuestBinding
        get() = { ActivityGuestBinding.inflate(layoutInflater) }

    override fun setupView() {
        supportActionBar?.title = "Guest"
        vm.guest.observe(this, { guest ->
            val listGuest = guest.map {
                Guest(
                    name = it.name,
                    birth = it.birthdate
                )
            }

            guestAdapter.submitList(listGuest)
        })

        vm.isLoading.observe(this, {
            binding.progressBar.visibility = if (it) View.VISIBLE else View.GONE
            binding.rvGuest.visibility = if (it) View.GONE else View.VISIBLE
        })

        setGuestAdapter()

    }

    private fun setGuestAdapter() {
        with(binding.rvGuest) {
            adapter = guestAdapter
            setHasFixedSize(true)

            guestAdapter.setOnClickData {
                setResult(
                    222,
                    Intent().putExtra(MainActivity.EXTRA_GUEST_NAME, it.name)
                )

                it.birth?.let { it1 -> toast(it1.checkDate()) }
                onBackPressed()
            }
        }
    }

    fun String.checkDate(): String {
        val date = this.split("-")
        return if (date[2].toInt() % 2 == 0 && date[2].toInt() % 3 == 0) {
            "iOS"
        } else if (date[2].toInt() % 3 == 0) {
            "android"
        } else if (date[2].toInt() % 2 == 0) {
            "blackberry"
        } else {
            "feature phone"
        }
    }

    /**Determine the month is prime or not.*
     *
     */

    fun String.checkPrimeMonth(): String {
        for (i in 2..this.toInt() /  2) {
            if (this.toInt() % i == 0) {
                return "The month is not prime"
            }
        }
        return "The month is prime"
    }

}