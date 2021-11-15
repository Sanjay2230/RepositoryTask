package com.example.latestrepositories.view

import android.annotation.SuppressLint
import android.app.SearchManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latestrepositories.R
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.SearchView
import android.widget.SearchView.OnQueryTextListener;
import androidx.lifecycle.ViewModelProviders.of
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.DividerItemDecoration.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.latestrepositories.model.entity.Repositories
import com.example.latestrepositories.networks.ApiInterface
import com.example.latestrepositories.view.adapters.RepoListAdapter
import com.example.latestrepositories.viewmodel.RepositoryViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import android.content.Context
import android.os.Build
import android.text.InputType
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.view.MenuItemCompat
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.RecyclerView
import com.example.latestrepositories.utils.RecyclerViewPagination
import com.example.latestrepositories.utils.Utils
import com.example.latestrepositories.utils.goneView
import com.example.latestrepositories.utils.showView
import org.json.JSONArray
import org.json.JSONObject


class MainActivity : Utils(), SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {

    private lateinit var repositoryViewModel: RepositoryViewModel
    private lateinit var repoListAdapter: RepoListAdapter
    private lateinit var repoList: ArrayList<Repositories>
    private lateinit var searchView: androidx.appcompat.widget.SearchView
    var currentInt = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        objectInitialization()
        showRepoList()
        if(isNetworkAvailable()){
            networkCall()
        }else{
            error.showView()
            retry.showView()
            repo_list.goneView()
        }
    }

    private fun objectInitialization(){
        repositoryViewModel = of(this)[RepositoryViewModel::class.java]
        repoListAdapter = RepoListAdapter(this)
        refreshLayout.setOnRefreshListener(this)
        refreshLayout.setColorSchemeResources(android.R.color.white)
        refreshLayout.setProgressBackgroundColorSchemeResource(R.color.blue_900)
        repositoryViewModel.getLastRecordId {
            currentInt = it ?: 0
        }
        retry.setOnClickListener(this)
    }

    fun showRepoList(){
        progress.showView()
        repo_list.adapter = repoListAdapter
        repo_list.layoutManager = LinearLayoutManager(this)
        repo_list.addItemDecoration(DividerItemDecoration(this, VERTICAL))
        repo_list.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1) && newState==RecyclerView.SCROLL_STATE_IDLE) {
                    networkCall()
                }
            }
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val layoutManager = LinearLayoutManager::class.java.cast(repo_list.layoutManager)
                val totalItemCount = layoutManager.itemCount
                val lastVisible = layoutManager.findLastVisibleItemPosition()

                val endHasBeenReached = lastVisible + 5 >= totalItemCount
                if (totalItemCount > 0 && endHasBeenReached) {
                    repoListAdapter.getLastItem(lastVisible, onSuccess = {
                        currentInt = it
                    })
                }

                val topRowVerticalPosition =
                    if (recyclerView == null || recyclerView.childCount === 0) 0 else recyclerView.getChildAt(
                        0
                    ).top
                refreshLayout.isEnabled = topRowVerticalPosition >= 0
            }
        })
        repoList = ArrayList()
        repositoryViewModel.getRepoList {
            it.observe(this, { v ->
                progress.goneView()
                error.goneView()
                retry.goneView()
                repo_list.showView()
                repoList = v as ArrayList<Repositories>
                repoListAdapter.setData(repoList)
            })
        }
    }

    private fun networkCall(){
        val apiInterface = ApiInterface.create().getRepoList(currentInt)
        apiInterface.enqueue(object : Callback<List<Repositories>> {
            override fun onResponse(call: Call<List<Repositories>>, response: Response<List<Repositories>>) {
                if (response.isSuccessful) {
                    error.goneView()
                    retry.goneView()
                    repo_list.showView()
                    refreshLayout.isRefreshing = false
                    repositoryViewModel.insert(response.body()!!)
                }
            }

            override fun onFailure(call: Call<List<Repositories>>, t: Throwable) {
                Log.d("main", "onFailure: " + t.message)
            }
        })
    }

    override fun onRefresh() {
        if(isNetworkAvailable()){
            repositoryViewModel.getLastRecordId {
                currentInt = it ?: 0
            }
            networkCall()
        }else{
            refreshLayout.isRefreshing = false
            error.showView()
            retry.showView()
            repo_list.goneView()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_repo,menu)
        setSearchViewSetting(menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.search_id -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    @SuppressLint("NewApi", "SoonBlockedPrivateApi")
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    private fun setSearchViewSetting(
        menu: Menu?
    ) {

        val menuItem: MenuItem? = menu?.findItem(R.id.search_id)

        val searchView: androidx.appcompat.widget.SearchView? = MenuItemCompat.getActionView(menuItem) as androidx.appcompat.widget.SearchView?
        val imageView: ImageView? = searchView?.findViewById(androidx.appcompat.R.id.search_button)
        val cancelImageView: ImageView? =
            searchView?.findViewById(androidx.appcompat.R.id.search_close_btn)

        imageView?.setImageDrawable(getDrawable(R.drawable.ic_baseline_search_24))
        cancelImageView?.setImageDrawable(getDrawable(R.drawable.ic_baseline_clear_24))

        val editText =
            (searchView?.findViewById(androidx.appcompat.R.id.search_src_text) as EditText?)!!

        editText.setTextColor(resources.getColor(R.color.black))
        editText.setHintTextColor(resources.getColor(R.color.black))
        editText.hint = "Search by Name.."
        editText.isEnabled = true

        try {
            val mCursorDrawableRes = TextView::class.java.getDeclaredField("mCursorDrawableRes")
            mCursorDrawableRes.isAccessible = true
            mCursorDrawableRes.set(
                editText,
                R.drawable.cursor_design
            )
        } catch (e: Exception) {
        }

        menuItem?.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {

            override fun onMenuItemActionExpand(item: MenuItem?): Boolean {
                return true
            }

            override fun onMenuItemActionCollapse(item: MenuItem?): Boolean {
                repoListAdapter.setData(repoList)
                return true
            }
        })

        editText.doAfterTextChanged {

            if (!it.isNullOrBlank()) {
//                repoListAdapter.setData(repoList)
                repoListAdapter.filter.filter(it.toString())
            } else {
                repoListAdapter.setData(repoList)
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.retry -> {
                if(isNetworkAvailable()){
                    networkCall()
                }else{
                    error.showView()
                    retry.showView()
                    repo_list.goneView()
                }
            }
        }
    }
}