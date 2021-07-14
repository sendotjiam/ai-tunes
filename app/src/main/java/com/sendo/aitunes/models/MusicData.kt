package com.sendo.aitunes.models

import com.sendo.aitunes.R

object MusicData {
    private val musicTitle = arrayOf(
        "Butter",
        "Good 4 You",
        "Levitating",
        "Kiss Me More",
        "Montero",
        "Bad Habits",
        "Leave The Door Open",
        "Peaches",
        "Save Your Tears",
        "Deja Vu",
        "Astronaut in The Ocean",
        "Rapstar",
        "You Right",
        "Am I The Only One",
        "Blinding Lights"
    )

    private val musicSingerName = arrayOf(
        "BTS",
        "Olivia Rodrigo",
        "Dua Lipa",
        "Doja Cat ft. SZA",
        "Lil Nas X",
        "Ed Sheeran",
        "Silk Sonic",
        "Justin Bieber ft. Daniel Caesar & Giveon",
        "The Weeknd & Ariana Grande",
        "Olivia Rodrigo",
        "Masked Wolf",
        "Polo G",
        "Doja Cat & The Weeknd",
        "Aaron Lewis",
        "The Weeknd"
    )

    private val musicAlbumName = arrayOf(
        "Butter (Hotter, Sweeter, Cooler)",
        "Sour",
        "Future Nostalgia",
        "Planet Her",
        "MONTERO (Call Me By Your Name)",
        "Bad Habits",
        "Leave The Door Open",
        "Peaches",
        "After Hours",
        "Sour",
        "Astronaut In The Ocean",
        "Hall of Fame",
        "Planet Her",
        "Am I The Only One",
        "Blinding Lights"
    )

    private val musicReleaseYear = arrayOf(
        "2021", "2021", "2020", "2021", "2021",
        "2021", "2021", "2021", "2020", "2021",
        "2019", "2021", "2021", "2021", "2019"
    )

    private val musicDescription = arrayOf(
        "\"Butter\" is a song recorded by South Korean boy group BTS and released as a digital single on May 21, 2021, through Big Hit Music and Sony Music Entertainment, as the band's second English-language single.",
        "\"Good 4 U\" (stylized in all lowercase) is a song recorded by American singer-songwriter Olivia Rodrigo. It was released on May 14, 2021, through Geffen and Interscope Records, as the third single from Rodrigo's debut studio album, Sour (2021).",
        "\"Levitating\" is a song by English singer Dua Lipa from her second studio album, Future Nostalgia (2020). The song was written by Lipa, Clarence Coffee Jr., Sarah Hudson and Stephen Kozmeniuk, with the image of Mike Myers in Austin Powers in mind.",
        "\"Kiss Me More\" is a song by American singer and rapper Doja Cat featuring American singer SZA. It was released on April 9, 2021, through Kemosabe and RCA Records as the lead single from Doja Cat's third studio album Planet Her.",
        "\"Montero (Call Me by Your Name)\" (stylized as \"MONTERO (Call Me By Your Name)\") is a song by American rapper and singer Lil Nas X. First previewed in a Super Bowl LV commercial in February 2021, the song was released on March 26, 2021, through Columbia Records.",
        "\"Bad Habits\" is a song by British singer Ed Sheeran, released on 25 June 2021 through Asylum Records as the lead single off his upcoming fifth studio album.",
        "\"Leave the Door Open\" is the debut single by the American super-duo Silk Sonic, consisting of Bruno Mars and Anderson .Paak. It was released on March 5, 2021 by Aftermath Entertainment and Atlantic Records as the lead single from Silk Sonic's upcoming debut studio album An Evening with Silk Sonic.",
        "\"Peaches\" is a song recorded by Canadian singer Justin Bieber, featuring vocals from fellow Canadian singer-songwriter Daniel Caesar and American singer-songwriter Giveon.",
        "\"Save Your Tears\" is a song by Canadian singer the Weeknd for his fourth studio album After Hours (2020). The Weeknd wrote and produced the song with producers Max Martin and Oscar Holter, with Belly and Jason Quenneville receiving additional writing credits.",
        "\"Deja Vu\" (stylized in all lowercase) is a song recorded by American singer-songwriter Olivia Rodrigo. It was released on April 1, 2021, as the second single from Rodrigo's debut studio album, Sour (2021), through Geffen and Interscope Records.",
        "\"Astronaut in the Ocean\" is a song by Australian rapper Masked Wolf. It was originally released in June 2019 before being re-released through Elektra Records on 6 January 2021.",
        "\"Rapstar\" (stylized in all caps) is a song by American rapper Polo G. It was released through Columbia Records as the third single from his third studio album, Hall of Fame, on April 9, 2021.",
        "\"You Right\" is a song recorded by American singer and rapper Doja Cat and Canadian singer the Weeknd, released through Kemosabe and RCA Records on June 25, 2021, as the second[2][3] single from Doja Cat's third studio album, Planet Her.",
        "\"Am I the Only One\" is a song co-written and recorded by American singer Aaron Lewis. It was released on July 2, 2021, via Big Machine Records' Valory imprint. It is a protest song with a conservative message.",
        "\"Blinding Lights\" is a song by Canadian singer the Weeknd, released on November 29, 2019, through XO and Republic Records, as the second single from his fourth studio album After Hours (2020).",

    )

    private val musicImg = intArrayOf(
        R.drawable.butter,
        R.drawable.good_4_you,
        R.drawable.levitating,
        R.drawable.kiss_me_more,
        R.drawable.montero,
        R.drawable.bad_habits,
        R.drawable.leave_the_door_open,
        R.drawable.peaches,
        R.drawable.save_your_tears,
        R.drawable.deja_vu,
        R.drawable.astronaut_in_the_ocean,
        R.drawable.rapstar,
        R.drawable.you_right,
        R.drawable.am_i_the_only_one,
        R.drawable.blinding_rights
    )

    val listMusicData : MutableList<Music> get() {
        val dataList = mutableListOf<Music>()
        for (index in musicTitle.indices) {
            val music = Music()
            music.musicTitle = musicTitle[index]
            music.musicSingerName = musicSingerName[index]
            music.musicAlbumName = musicAlbumName[index]
            music.musicReleaseYear = musicReleaseYear[index]
            music.musicDescription = musicDescription[index]
            music.musicImg = musicImg[index]
            dataList.add(music)
        }
        return dataList
    }
}