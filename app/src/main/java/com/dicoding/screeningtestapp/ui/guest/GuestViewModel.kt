package com.dicoding.screeningtestapp.ui.guest

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dicoding.screeningtestapp.data.remote.response.GuestResponse
import com.dicoding.screeningtestapp.data.remote.service.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GuestViewModel : ViewModel() {
    private val _guest = MutableLiveData<List<GuestResponse.GuestResponseItem>>()
    val guest: LiveData<List<GuestResponse.GuestResponseItem>> = _guest

    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    init {
        getGuestList()
    }
    fun getGuestList() {
        _isLoading.value = true
        val client = ApiConfig.getApiService().getGuestList()
        client.enqueue(object : Callback<ArrayList<GuestResponse.GuestResponseItem>>{
            override fun onResponse(
                call: Call<ArrayList<GuestResponse.GuestResponseItem>>,
                response: Response<ArrayList<GuestResponse.GuestResponseItem>>
            ) {
                _isLoading.value = false
                if (response.isSuccessful) {
                    _guest.value = response.body()
                } else {
                    Log.e(TAG, "onFailure: ${response.message()}")
                }
            }
            override fun onFailure(call: Call<ArrayList<GuestResponse.GuestResponseItem>>, t: Throwable) {
                _isLoading.value = false
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }
        })
    }

    companion object{
        private const val TAG = "GuestViewModel"
    }
}