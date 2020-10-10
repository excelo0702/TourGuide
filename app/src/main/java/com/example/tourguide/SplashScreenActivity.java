package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {
    private int SLEEP_TIMER =3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        LogoLauncher logoLauncher= new LogoLauncher();
        logoLauncher.start();
    }
    private class LogoLauncher extends Thread {
        public void run() {
            try {
                sleep(1000*SLEEP_TIMER);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(intent);
            SplashScreenActivity.this.finish();
        }
    }
}