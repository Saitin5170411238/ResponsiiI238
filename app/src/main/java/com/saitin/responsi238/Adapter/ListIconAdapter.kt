package com.saitin.responsi238.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.saitin.responsi238.R
import com.saitin.responsi238.Iconer

class ListIconAdapter(private val listIconer: ArrayList<Iconer>)
    : RecyclerView.Adapter<ListIconAdapter.IconViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.daftar_icon, parent, false)
        return IconViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listIconer.size
    }

    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val icon = listIconer[position]
        holder.tvName.text = icon.name
        holder.tvDetail.text = icon.detail
        Glide.with(holder.itemView.context)
            .load(icon.poster)
            .into(holder.imgPoster)


    }

    inner class IconViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)


    }
}
