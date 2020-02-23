package com.example.myapplication;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Home");
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new FirstFragment()).commit();


    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFrag = null;
            ActionBar actionBar = getSupportActionBar();
            switch (item.getItemId()) {
                case R.id.nav_home:
                    selectedFrag = new FirstFragment();
                    actionBar.setTitle("Home");
                    break;
                case R.id.nav_orders:
                    selectedFrag = new SecondFragment();
                    actionBar.setTitle("Orders");
                    break;
                case R.id.nav_kamusiko:
                    selectedFrag = new ThirdFragment();
                    actionBar.setTitle("KaMusiKo");
                    break;
                case R.id.nav_recordings:
                    selectedFrag = new FourthFragment();
                    actionBar.setTitle("Recordings");
                    break;
                case R.id.nav_account:
                    selectedFrag = new FiveFragment();
                    actionBar.setTitle("My Account");
                    break;
                default: return true;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, selectedFrag).commit();
            return true;
        }
    };


}

