package com.example.bkt2;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_fr,new com.example.bkt2.FragmentTrangChu()).commit();
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment= null;
                switch (item.getItemId()){
                    case R.id.nav_trangchu:
                        selectedFragment= new com.example.bkt2.FragmentTrangChu();
                        break;
                    case R.id.nav_profile:
                        selectedFragment= new com.example.bkt2.FragmentProfile();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container_fr,selectedFragment).commit();
                return true;
            }
        });
    }
}