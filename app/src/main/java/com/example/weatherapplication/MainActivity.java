package com.example.weatherapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

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

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener () {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                        switch (item.getItemId()) {
                            case R.id.i_t:
                                //startActivity(new Intent(MainActivity.this, MainActivity.class));
                                break;
                            case R.id.i_f:
                                startActivity(new Intent(MainActivity.this, ForecastActivity.class));
                                break;
                        }
                        return true;
                    }
                });
    }




}