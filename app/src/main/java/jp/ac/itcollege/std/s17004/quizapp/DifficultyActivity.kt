package jp.ac.itcollege.std.s17004.quizapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.difficulty.*
import kotlinx.android.synthetic.main.quiz.*

class DifficultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.difficulty)


        normal_button.setOnClickListener {
            val normal = Intent(this, NormalActivity::class.java)
            startActivity(normal)
        }

        hard_button.setOnClickListener {
            val hard = Intent(this, HardActivity::class.java)
            startActivity(hard)
        }

        genre_button.setOnClickListener {
            val genre = Intent(this, GenreList::class.java)
            startActivity(genre)
        }


    }
}