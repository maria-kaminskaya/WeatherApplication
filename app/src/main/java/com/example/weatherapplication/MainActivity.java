package com.example.weatherapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context mainContext = this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                MyLocationListener.SetUpLocationListener(mainContext);
            }
        }).start();


        TextView textView = findViewById(R.id.city);
        textView.setText((CharSequence) MyLocationListener.imHere);
    }




}