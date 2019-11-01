package com.saitin.responsi238

object DataIcon {

    private val nama_iconprogram= arrayOf(
        "Ruby",
        "Ralis",
        "Phyton",
        "Java Script",
        "PHP",
        "csharp",
        "dart",
        "dev",
        "javaa",
        "node_js"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language",
        "Ruby on Ralis is a server-side web application development framework written in Ruby language",
        "Phyton is interpreted scripting and object-oriented programming language",
        "Java Script is an object-based scripting language",
        "PHP is an interpreted language, i.e., there is no need for compilation",
        "C Sharp reads is a simple programming language that is used for general purposes",
        "Dart can be used to create android applications, web front-end, IoT, backend (CLI), and Games.",
        "Dev-C ++ is an IDE (Integrated Development Environment) C/C ++ which is equipped with TDM-GCC Compiler",
        "Java as one of the programming languages that have been aged from the era of the 1990s",
        "Node.js is software designed to develop web-based applications and is written in the syntax of the JavaScript programming language."
    )

    private val iconprogramPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.ralis,
        R.drawable.phyton,
        R.drawable.javascript,
        R.drawable.php,
        R.drawable.csharp,
        R.drawable.dart,
        R.drawable.dev,
        R.drawable.javaa,
        R.drawable.node_js
    )

    val getListIcon: ArrayList<Iconer>
        get(){
            val list = arrayListOf<Iconer>()
            for (position in nama_iconprogram.indices){
                val iconprogram = Iconer()
                iconprogram.name = nama_iconprogram[position]
                iconprogram.detail = detail[position]
                iconprogram.poster = iconprogramPoster[position]
                list.add(iconprogram)
            }
            return list
        }


}
