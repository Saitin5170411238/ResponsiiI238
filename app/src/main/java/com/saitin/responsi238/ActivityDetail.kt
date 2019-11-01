package com.saitin.responsi238

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ActivityDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val img_item_poster: ImageView = findViewById(R.id.img_item_poster)
        val tv_item_name: TextView = findViewById(R.id.tv_item_name)
        val tv_item_detail: TextView = findViewById(R.id.tv_item_detail)

        val namaIcon = intent.getStringExtra(EXTRA_NAME)
        val detailIcon = intent.getStringExtra(EXTRA_DETAIL)
        val posterIcon = intent.getStringExtra(EXTRA_POSTER)

        Glide.with(baseContext)
            .load(posterIcon)
            .apply(RequestOptions().override(200,300))
            .into(img_item_poster)
    }

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_POSTER = "extra_poster"
    }
}
