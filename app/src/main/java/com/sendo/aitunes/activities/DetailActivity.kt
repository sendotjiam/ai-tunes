package com.sendo.aitunes.activities

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sendo.aitunes.R
import com.sendo.aitunes.utilities.Constant


class DetailActivity : AppCompatActivity() {

    private lateinit var tvMusicTitle : TextView
    private lateinit var tvMusicSingerName : TextView
    private lateinit var tvAlbumAndReleaseYear : TextView
    private lateinit var tvMusicDescription : TextView
    private lateinit var ivMusicImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initialize()

        bindDataWithView()
    }
    private fun initialize() {
        tvMusicTitle = findViewById(R.id.tv_music_title)
        tvMusicSingerName = findViewById(R.id.tv_music_singer_name)
        tvAlbumAndReleaseYear = findViewById(R.id.tv_album_and_release_year)
        tvMusicDescription = findViewById(R.id.tv_music_description)
        ivMusicImg = findViewById(R.id.iv_music_image)
    }

    private fun bindDataWithView() {
        ivMusicImg.setImageResource(intent.getIntExtra(Constant.MUSIC_IMG, 0))
        tvMusicTitle.text = intent.getStringExtra(Constant.MUSIC_TITLE)
        tvMusicSingerName.text = intent.getStringExtra(Constant.MUSIC_SINGER_NAME)
        tvAlbumAndReleaseYear.text =
            "${intent.getStringExtra(Constant.MUSIC_ALBUM_NAME)} - ${intent.getStringExtra(Constant.MUSIC_RELEASE_YEAR)}"
        tvMusicDescription.text = intent.getStringExtra(Constant.MUSIC_DESCRIPTION)
    }

    fun showAddToFavoritesDialog(view : View) {
        AlertDialog.Builder(this)
            .setTitle("Add To Favorite")
            .setIcon(R.drawable.logo)
            .setMessage("Success add to favorites")
            .show()
    }
}