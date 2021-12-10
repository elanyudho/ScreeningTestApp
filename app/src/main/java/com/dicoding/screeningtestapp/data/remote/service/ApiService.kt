package com.dicoding.screeningtestapp.data.remote.service

import com.dicoding.screeningtestapp.data.remote.response.GuestResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("596dec7f0f000023032b8017")
    fun getGuestList(): Call<ArrayList<GuestResponse.GuestResponseItem>>
}