package com.dicoding.screeningtestapp.extension

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.dicoding.screeningtestapp.R

fun ImageView.glide(view: View, image: Any) {
    try {
        Glide.with(view)
            .load(image)
            .error(R.drawable.ic_launcher_background)
            .into(this)
    } catch (ignored: Throwable) {
    }
}

fun ImageView.glide(context: Context, image: Any) {
    try {
        Glide.with(context)
            .load(image)
            .error(R.drawable.ic_launcher_background)
            .into(this)
    } catch (ignored: Throwable) {
    }
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}