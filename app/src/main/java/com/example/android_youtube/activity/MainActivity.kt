package com.example.android_youtube.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_youtube.R
import com.example.android_youtube.adapter.FeedAdapter
import com.example.android_youtube.adapter.FilterAdapter
import com.example.android_youtube.model.Feed
import com.example.android_youtube.model.Filter

class MainActivity : AppCompatActivity() {
    lateinit var recyclerFilter: RecyclerView
    lateinit var recyclerFeed: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        recyclerFilter = findViewById(R.id.recyclerFilter)
        recyclerFilter.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFeed.layoutManager = GridLayoutManager(this, 1)

        refreshFeedAdapter(getAllFeeds())
        refreshFilterAdapter(getAllFilters())
    }

    fun refreshFeedAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerFeed.adapter = adapter
    }

    fun getAllFeeds(): ArrayList<Feed> {
        var feeds: ArrayList<Feed> = ArrayList()
        feeds.add(Feed(R.drawable.profile_img1, R.drawable.im_video_1))
        feeds.add(Feed(R.drawable.profile_img2, R.drawable.im_video_2))
        feeds.add(Feed(R.drawable.profile_img3, R.drawable.im_video_3))
        feeds.add(Feed(R.drawable.profile_img1, R.drawable.im_video_1))
        feeds.add(Feed(R.drawable.profile_img2, R.drawable.im_video_2))
        feeds.add(Feed(R.drawable.profile_img3, R.drawable.im_video_3))
        feeds.add(Feed(R.drawable.profile_img1, R.drawable.im_video_1))
        feeds.add(Feed(R.drawable.profile_img2, R.drawable.im_video_2))
        feeds.add(Feed(R.drawable.profile_img3, R.drawable.im_video_3))

        return feeds
    }

    fun refreshFilterAdapter(filters: ArrayList<Filter>) {
        val adapter = FilterAdapter(this, filters)
        recyclerFilter.adapter = adapter
    }

    fun getAllFilters(): ArrayList<Filter> {
        var filters: ArrayList<Filter> = ArrayList()
        filters.add(Filter("Computer Programming"))
        filters.add(Filter("Android Native"))
        filters.add(Filter("Mobile Development"))

        return filters
    }

}