package com.dicoding.screeningtestapp.data.remote.response


import com.google.gson.annotations.SerializedName

class GuestResponse : ArrayList<GuestResponse.GuestResponseItem>(){
    data class GuestResponseItem(
        @SerializedName("birthdate")
        val birthdate: String = "",
        @SerializedName("id")
        val id: Int = 0,
        @SerializedName("name")
        val name: String = ""
    )
}