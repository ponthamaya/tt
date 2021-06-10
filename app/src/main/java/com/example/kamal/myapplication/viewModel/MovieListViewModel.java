package com.example.kamal.myapplication.viewModel;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.example.kamal.myapplication.model.MovieModel;
import com.example.kamal.myapplication.repository.MovieRepository;
import com.scand.svg.SVGHelper;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Arti on 8/6/21.
 */

public class MovieListViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<MovieModel> data;
    private MovieRepository movieModel;

    public MovieListViewModel() {
        movieModel = new MovieRepository();
    }

    public void init() {
        if (this.data != null) {
            // ViewModel is created per Fragment so
            // we know the userId won't change
            return;
        }
        data = movieModel.getMovies();
    }

    public MutableLiveData<MovieModel> getMovies() {
        return this.data;
    }

    public Drawable getSvg(Context context) {
        try {
            Log.w("msg", "img== ");
            BitmapDrawable img = SVGHelper.noContext().open(new URL("https://upload.wikimedia.org/wikipedia/commons/7/73/Flat_tick_icon.svg")).getBitmapDrawable(context);
            Log.w("msg", "img1== " + img);
            return img;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
