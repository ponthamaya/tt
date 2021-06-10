package com.example.kamal.myapplication.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Arti on 8/6/21.
 */

public class MovieModel {


    public List<DataModel> getData() {
        return data;
    }

    public void setData(List<DataModel> data) {
        this.data = data;
    }

    @SerializedName("data")
    List<DataModel> data;

    public class DataModel {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @SerializedName("name")
        String name;
    }

}
