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
import com.example.latestrepositories.utils.Utils
import com.example.latestrepositories.utils.goneView
import com.example.latestrepositories.utils.showView


class MainActivity : Utils(), SwipeRefreshLayout.OnRefreshListener, View.OnClickListener {

    private lateinit var repositoryViewModel: RepositoryViewModel
    private lateinit var repoListAdapter: RepoListAdapter
    private lateinit var repoList: ArrayList<Repositories>
    private lateinit var searchView: androidx.appcompat.widget.SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
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
        retry.setOnClickListener(this)
    }

    fun showRepoList(){
        progress.showView()
        repo_list.adapter = repoListAdapter
        repo_list.layoutManager = LinearLayoutManager(this)
        repo_list.addItemDecoration(DividerItemDecoration(this, VERTICAL))
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
        val apiInterface = ApiInterface.create().getRepoList()
        apiInterface.enqueue(object : Callback<List<Repositories>> {
            override fun onResponse(call: Call<List<Repositories>>, response: Response<List<Repositories>>) {
                if (response.isSuccessful) {
                    error.goneView()
                    retry.goneView()
                    repo_list.showView()
                    refreshLayout.isRefreshing = false
                    Log.d("Response", "OnScuccess: " + response.message())
                    Log.d("Response", "OnScuccess: " + response.body().toString())
                    val repolist = response.body()
                    repolist?.forEach { it ->
                        val isExists = repositoryViewModel.isRecordExists(it.author!!, it.name!!, it.language!!)
                        if(isExists == 0){
                            repositoryViewModel.insert(it)
                        }
                    }
                }
            }

            override fun onFailure(call: Call<List<Repositories>>, t: Throwable) {
                Log.d("main", "onFailure: " + t.message)
            }
        })
    }

    override fun onRefresh() {
        if(isNetworkAvailable()){
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
        /*val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        searchView = menu!!.findItem(R.id.search_id).actionView as androidx.appcompat.widget.SearchView
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName))
        searchView.maxWidth = Int.MAX_VALUE

        searchView.setOnQueryTextListener(object : androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                // filter recycler view when query submitted
                repoListAdapter.filter.filter(query)
                return false
            }

            override fun onQueryTextChange(query: String): Boolean {
                // filter recycler view when text is changed
                repoListAdapter.filter.filter(query)
                return false
            }
        })*/
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

    override fun onBackPressed() {
        // close search view on back button pressed
        if (!searchView.isIconified) {
            searchView.isIconified = true
            return
        }
        super.onBackPressed()
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
        editText.inputType =
            InputType.TYPE_TEXT_VARIATION_PERSON_NAME or InputType.TYPE_TEXT_FLAG_CAP_WORDS
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
                repoListAdapter.setData(repoList)
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