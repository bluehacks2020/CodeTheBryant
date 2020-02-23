package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class kulintangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulintang);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Kulintang");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.try_instrument, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_play:
                Intent intent1 = new Intent(this, kulintangMusic.class);
                this.startActivity(intent1);
                return true;
            case R.id.action_buy:
                Intent intent2 = new Intent(this, BuyingActivity.class);
                this.startActivity(intent2);
                return true;
                default:
                    return super.onOptionsItemSelected(item);

        }

    }
}
