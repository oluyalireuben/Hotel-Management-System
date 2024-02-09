package com.example.ho_tel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class GoogleMapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps);
        Fragment fragment = new MapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();

    }
}