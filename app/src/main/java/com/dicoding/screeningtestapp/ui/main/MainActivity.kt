package com.dicoding.screeningtestapp.ui.main

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import androidx.activity.result.contract.ActivityResultContracts
import com.dicoding.screeningtestapp.R
import com.dicoding.screeningtestapp.abstractfile.BaseActivityBinding
import com.dicoding.screeningtestapp.databinding.ActivityMainBinding
import com.dicoding.screeningtestapp.ui.event.EventActivity
import com.dicoding.screeningtestapp.ui.guest.GuestActivity

class MainActivity : BaseActivityBinding<ActivityMainBinding>() {

    private var userName = ""

    private var guestName = "Pilih Guest"

    private var eventName = "Pilih Event"

    private var bundle:Bundle? = null

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = { ActivityMainBinding.inflate(layoutInflater) }


    override fun setupView() {
        supportActionBar?.title = "Beranda"

        val pref: SharedPreferences? = applicationContext  .getSharedPreferences("pref", Context.MODE_PRIVATE)
        val prefEdit: SharedPreferences.Editor? = pref?.edit()

        val resultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){result ->
            if (result.resultCode == 111){
                binding.btnEvent.text = result.data?.getStringExtra(EXTRA_EVENT_NAME)?:""
            }else if (result.resultCode == 222){
                binding.btnGuest.text = result.data?.getStringExtra(EXTRA_GUEST_NAME)?:""
            }

        }

        userName = intent.getStringExtra(EXTRA_USER_NAME)?: ""
        prefEdit?.putString("name", ": $userName")
        prefEdit?.apply()

        with(binding){
            btnEvent.text = eventName
            btnGuest.text = guestName
            tvName.text = pref?.getString("name","")


            btnEvent.setOnClickListener {
                resultLauncher.launch(Intent(this@MainActivity, EventActivity::class.java))
            }

            btnGuest.setOnClickListener {
                resultLauncher.launch(Intent(this@MainActivity, GuestActivity::class.java))
            }
        }

    }

    companion object{

        const val EXTRA_USER_NAME = "user name"

        const val EXTRA_GUEST_NAME = "guest name"

        const val EXTRA_EVENT_NAME = "event name"
    }
}