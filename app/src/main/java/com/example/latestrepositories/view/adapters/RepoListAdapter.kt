package com.example.latestrepositories.view.adapters

import android.annotation.SuppressLint

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.example.latestrepositories.R
import com.example.latestrepositories.model.entity.Repositories
import com.example.latestrepositories.view.viewHolders.RepoListViewHolder

class RepoListAdapter(val context: Context):RecyclerView.Adapter<RepoListViewHolder>(), Filterable {
    var repoList = ArrayList<Repositories>()
    var filteredrepoList = ArrayList<Repositories>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepoListViewHolder {
        return RepoListViewHolder(LayoutInflater.from(context).inflate(R.layout.repo_list_design,parent,false))
    }

    override fun onBindViewHolder(holder: RepoListViewHolder, position: Int) {
        val obj = filteredrepoList[position]
        holder.bind(obj, position)
    }

    override fun getItemCount(): Int {
        return filteredrepoList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(list: ArrayList<Repositories>){
        repoList = list
        filteredrepoList = list
        notifyDataSetChanged()
    }

    fun getLastItem(pos: Int, onSuccess:(lastItemId : Int) -> Unit){
        val lastId = filteredrepoList[pos].id
        onSuccess(lastId ?: 0)
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charString = charSequence.toString()
                if (charString.isEmpty()) {
                    filteredrepoList = repoList
                } else {
                    val filteredList: MutableList<Repositories> = ArrayList()
                    for (obj in repoList) {

                        // name match condition. this might differ depending on your requirement
                        // here we are looking for name
                        if (obj.name?.toLowerCase()?.contains(charString.toLowerCase()) == true) {
                            filteredList.add(obj)
                        }
                    }
                    filteredrepoList = filteredList as ArrayList<Repositories>
                }
                val filterResults = FilterResults()
                filterResults.values = filteredrepoList
                return filterResults
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                filteredrepoList = filterResults.values as ArrayList<Repositories>
                notifyDataSetChanged()
            }
        }
    }
}