package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText editTextUsername, editTextPassword;
    TextView textViewRegister;
    Button buttonGuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        LinearLayout linearLayout = findViewById(R.id.layout);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword  = findViewById(R.id.editTextPassword);
        textViewRegister = findViewById(R.id.textViewRegister);
        buttonGuest = findViewById(R.id.buttonGuest);

        buttonGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                Toast.makeText(LoginActivity.this, "Logged in as Guest", Toast.LENGTH_SHORT).show();
            }
        });

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = "BLUEHACKS";

                String user = editTextUsername.getText().toString().trim();
                String pass = editTextPassword.getText().toString().trim();

                if(user.equals(account) && pass.equals(account)){
                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                    Toast.makeText(LoginActivity.this, "Successfully Logged in!", Toast.LENGTH_SHORT).show();
                }

            }
        });


        AnimationDrawable animationDrawable = (AnimationDrawable)linearLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

        TextView register;
        register = findViewById(R.id.txtRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


    }

}
