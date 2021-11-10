package com.example.latestrepositories.utils

import androidx.annotation.NonNull
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE

abstract class RecyclerViewPagination(private val recyclerView: RecyclerView) :
    RecyclerView.OnScrollListener() {
    private val threshold = 2
    private var endWithAuto = false
    private var layoutManager: RecyclerView.LayoutManager? = null
    private fun init() {
        recyclerView.addOnScrollListener(this)
        layoutManager = recyclerView.layoutManager
        //        loadFirstData();
    }

    override fun onScrollStateChanged(@NonNull recyclerView: RecyclerView, newState: Int) {
        super.onScrollStateChanged(recyclerView, newState)
        if (newState == SCROLL_STATE_IDLE) {
            val visibleItemCount = layoutManager!!.childCount
            val totalItemCount = layoutManager!!.itemCount
            var firstVisibleItemPosition = 0
            if (layoutManager is LinearLayoutManager) {
                firstVisibleItemPosition =
                    (layoutManager as LinearLayoutManager?)!!.findLastVisibleItemPosition()
            } else if (layoutManager is GridLayoutManager) {
                firstVisibleItemPosition =
                    (layoutManager as GridLayoutManager?)!!.findLastVisibleItemPosition()
            }
            if (isLastPage) return
            if (visibleItemCount + firstVisibleItemPosition + threshold >= totalItemCount) {
                if (!endWithAuto) {
                    endWithAuto = true
                    loadMore()
                }
            } else {
                endWithAuto = false
            }
        }
    }

    override fun onScrolled(@NonNull recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
    }

    abstract val isLastPage: Boolean

    abstract fun loadMore() //    public abstract void loadFirstData();

    init {
        init()
    }
}