package jp.ac.itcollege.std.s17004.quizapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.genre_list.*

class GenreList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genre_list)

        s17001_button.setOnClickListener {
            val s17001 = Intent(this, NoLevel::class.java)
            startActivity(s17001)
        }
        s17002_button.setOnClickListener {
            val s17002 = Intent(this, NoLevel::class.java)
            startActivity(s17002)
        }
        s17003_button.setOnClickListener {
            val s17003 = Intent(this, NoLevel::class.java)
            startActivity(s17003)
        }
        s17004_button.setOnClickListener {
            val s17004 = Intent(this, NoLevel::class.java)
            startActivity(s17004)
        }
        s17005_button.setOnClickListener {
            val s17005 = Intent(this, NoLevel::class.java)
            startActivity(s17005)
        }
        s17006_button.setOnClickListener {
            val s17006 = Intent(this, NoLevel::class.java)
            startActivity(s17006)
        }
        s17007_button.setOnClickListener {
            val s17007 = Intent(this, NoLevel::class.java)
            startActivity(s17007)
        }
        s17008_button.setOnClickListener {
            val s17008 = Intent(this, NoLevel::class.java)
            startActivity(s17008)
        }
        s17009_button.setOnClickListener {
            val s17009 = Intent(this, NoLevel::class.java)
            startActivity(s17009)
        }
        s17010_button.setOnClickListener {
            val s17010 = Intent(this, NoLevel::class.java)
            startActivity(s17010)
        }
        s17011_button.setOnClickListener {
            val s17011 = Intent(this, NoLevel::class.java)
            startActivity(s17011)
        }
        s17012_button.setOnClickListener {
            val s17012 = Intent(this, NoLevel::class.java)
            startActivity(s17012)
        }
        s06019_button.setOnClickListener {
            val s06019 = Intent(this, NoLevel::class.java)
            startActivity(s06019)
        }

    }
}