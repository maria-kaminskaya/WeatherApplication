package com.example.weatherapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MyLocationListener.SetUpLocationListener(this);



        TextView textView = findViewById(R.id.city);
        textView.setText((CharSequence) MyLocationListener.imHere);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
       // bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.i_t:
                        Toast.makeText(MainActivity.this, "Today", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.i_f:
                        Intent a = new Intent (MainActivity.this, ForecastActivity.class);
                        Toast.makeText(MainActivity.this, "Forecast", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }




}