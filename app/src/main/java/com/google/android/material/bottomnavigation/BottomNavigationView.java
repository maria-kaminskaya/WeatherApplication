package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class BottomNavigationView extends View {
    public BottomNavigationView(Context context) {
        this (context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attrs) {
        this (context, attrs, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attrs, int defStyle) {
        super (context, attrs, defStyle);
    }


    public void setOnNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
    }
}
