package com.gian.luca.pokemonapp.presentation;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import com.gian.luca.pokemonapp.R;



public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler(Looper.myLooper());
        final Intent intent = new Intent(this, HomeActivity.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToHome(intent);
            }
        },3000);
    }

    private void navigateToHome(Intent intent){
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
