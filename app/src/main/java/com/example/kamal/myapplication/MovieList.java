package com.example.kamal.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.kamal.myapplication.ui.movielist.MovieListFragment;
/**
 * Created by Arti on 8/6/21.
 */
public class MovieList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_list_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MovieListFragment.newInstance())
                    .commitNow();
        }
    }
}
