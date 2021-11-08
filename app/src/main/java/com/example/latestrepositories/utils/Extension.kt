package com.example.latestrepositories.utils

import android.view.View

fun View.goneView() {
    this.visibility = View.GONE
}

fun View.showView() {
    this.visibility = View.VISIBLE
}