package com.dicoding.screeningtestapp.ui.home

import android.content.Intent
import android.view.LayoutInflater
import com.dicoding.screeningtestapp.abstractfile.BaseActivityBinding
import com.dicoding.screeningtestapp.databinding.ActivityHomeBinding
import com.dicoding.screeningtestapp.extension.toast
import com.dicoding.screeningtestapp.ui.main.MainActivity

class HomeActivity : BaseActivityBinding<ActivityHomeBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityHomeBinding
        get() = { ActivityHomeBinding.inflate(layoutInflater) }

    override fun setupView() {
        supportActionBar?.title = "Home"
        binding.btnNext.setOnClickListener {
            doNext()
        }
    }

    private fun doNext() {

        with(binding) {
            if (edtTextName.text.isNullOrEmpty()) {
                edtTextName.error = "Bidang ini wajib diisi"
                edtTextName.requestFocus()
            } else {
                toast(edtTextName.text.toString().isPalindrome())
                val intent = Intent(this@HomeActivity, MainActivity::class.java)
                intent.putExtra(MainActivity.EXTRA_USER_NAME, edtTextName.text.toString())
                startActivity(intent)
            }
        }
    }

    fun String.isPalindrome(): String {
        return if (this.contains("suitmedia")){
            "not palindrome"
        }else{
            "isPalindrome"
        }
    }

}