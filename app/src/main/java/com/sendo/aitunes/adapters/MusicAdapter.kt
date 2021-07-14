package com.sendo.aitunes.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.sendo.aitunes.R
import com.sendo.aitunes.models.Music

class MusicAdapter (private val musicList : MutableList<Music>): RecyclerView.Adapter<MusicAdapter.ViewHolder>() {

    interface OnItemClickCallback {
        fun onItemClicked(data: Music)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_music, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val music = musicList[position]
        Glide.with(holder.itemView.context)
            .load(music.musicImg)
            .apply(RequestOptions().override(150, 150))
            .into(holder.ivItemPhoto)
        holder.tvItemMusicTitle.text = music.musicTitle
        holder.tvItemAlbumName.text = music.musicAlbumName
        holder.tvItemSingerName.text = "${music.musicSingerName} - ${music.musicReleaseYear}"

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(music)
        }
    }

    override fun getItemCount(): Int {
        return musicList.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var ivItemPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvItemMusicTitle : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvItemSingerName : TextView = itemView.findViewById(R.id.tv_item_singer_and_release_year)
        var tvItemAlbumName : TextView = itemView.findViewById(R.id.tv_item_album_name)
    }

}