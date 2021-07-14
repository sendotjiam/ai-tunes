package com.sendo.aitunes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sendo.aitunes.R
import com.sendo.aitunes.adapters.MusicAdapter
import com.sendo.aitunes.models.Music
import com.sendo.aitunes.models.MusicData
import com.sendo.aitunes.utilities.Constant

class MainActivity : AppCompatActivity() {

    private lateinit var rvMusic : RecyclerView
    private var musicList : MutableList<Music> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMusic = findViewById(R.id.rv_music)
        rvMusic.setHasFixedSize(true)

        musicList.addAll(MusicData.listMusicData)
        showMusicListRecyclerView()
    }

    private fun showMusicListRecyclerView() {
        rvMusic.layoutManager = LinearLayoutManager(this)
        val musicAdapter = MusicAdapter(musicList)
        rvMusic.adapter = musicAdapter

        musicAdapter.setOnItemClickCallback(object : MusicAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Music) {
                showMusicDetail(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.menu_profile) showProfile() else false
    }
    private fun showProfile() : Boolean {
        startActivity(Intent(this, ProfileActivity::class.java))
        return true
    }

    private fun showMusicDetail(data : Music) {
        val musicDetailDataBundle = Bundle()
        musicDetailDataBundle.putString(Constant.MUSIC_TITLE, data.musicTitle)
        musicDetailDataBundle.putString(Constant.MUSIC_ALBUM_NAME, data.musicAlbumName)
        musicDetailDataBundle.putString(Constant.MUSIC_DESCRIPTION, data.musicDescription)
        musicDetailDataBundle.putString(Constant.MUSIC_RELEASE_YEAR, data.musicReleaseYear)
        musicDetailDataBundle.putString(Constant.MUSIC_SINGER_NAME, data.musicSingerName)
        musicDetailDataBundle.putInt(Constant.MUSIC_IMG, data.musicImg)
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtras(musicDetailDataBundle)
        startActivity(intent)
    }

}