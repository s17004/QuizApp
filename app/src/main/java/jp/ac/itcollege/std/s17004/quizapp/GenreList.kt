package jp.ac.itcollege.std.s17004.quizapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.genre_list.*

class GenreList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.genre_list)

        val students = Array(12,{i -> "$i"})
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, students)
        list.adapter = adapter
    }

}