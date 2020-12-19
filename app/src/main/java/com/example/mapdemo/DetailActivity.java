package com.example.mapdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.annotations.SerializedName;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public class Stadium {
        @SerializedName("latitude")
        public Double latitude;
        @SerializedName("longitude")
        public Double longitude;
        @SerializedName("name1")
        public String name;
    }
}