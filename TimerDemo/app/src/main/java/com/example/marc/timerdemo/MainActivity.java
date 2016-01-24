package com.example.marc.timerdemo;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import java.util.logging.LogRecord;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000){

            public void onTick(long millisecondsTillDone){
                Log.i("Countdown", String.valueOf(millisecondsTillDone / 1000));
            }

            public void onFinish(){
                Log.i("Countdown", "Finished!");
            }
        }.start();

/*
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Runnable has run!", "Way to go!");
                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);*/
    }
}
