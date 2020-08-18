package com.example.aptitude_application;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class LunchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_screen);
        //new BackgroundTask().execute();
        new BackgroundTask(getApplicationContext()).execute();
    }
}