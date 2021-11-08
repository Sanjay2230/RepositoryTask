package com.example.latestrepositories.view.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latestrepositories.R
import com.example.latestrepositories.model.entity.Repositories
import com.example.latestrepositories.view.viewHolders.RepoListViewHolder

class RepoListAdapter(val context: Context):RecyclerView.Adapter<RepoListViewHolder>() {
    var repoList = ArrayList<Repositories>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoListViewHolder {
        return RepoListViewHolder(LayoutInflater.from(context).inflate(R.layout.repo_list_design,parent,false))
    }

    override fun onBindViewHolder(holder: RepoListViewHolder, position: Int) {
        val obj = repoList[position]
        holder.bind(obj, position)
    }

    override fun getItemCount(): Int {
        return repoList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: ArrayList<Repositories>){
        repoList = list
        notifyDataSetChanged()
    }
}