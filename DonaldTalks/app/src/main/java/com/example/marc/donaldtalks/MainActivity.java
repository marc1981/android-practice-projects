package com.example.marc.donaldtalks;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.content.Context;
import android.net.Uri;
import android.media.AudioManager;

public class MainActivity extends AppCompatActivity {

    SeekBar timerSeekBar;
    TextView timerTextView;
    Button controllerButton;
    Boolean counterIsActive = false;
    CountDownTimer countDownTimer;
    MediaPlayer mPlayer = (MediaPlayer.create(getApplicationContext(), R.id.worst));

    public void resetTimer(){
        timerTextView.setText("0:30");
        timerSeekBar.setProgress(30);
        countDownTimer.cancel();
        controllerButton.setText("Start");
        timerSeekBar.setEnabled(true);
        counterIsActive = false;
    }

    public void updateTimer(int secondsLeft){
        int minutes = (int) secondsLeft / 60;
        int seconds = secondsLeft - minutes * 60;

        String secondString = Integer.toString(seconds);

        if (seconds <= 9){
            secondString = "0" + secondString;
        }

        timerTextView.setText(Integer.toString(minutes) + ":" + secondString);
    }

    public void controlTimer(View view){

        Log.i("Button pressed", "Way to go!");

        if(counterIsActive == false){
            counterIsActive = true;
            timerSeekBar.setEnabled(false);
            controllerButton.setText("Stop");

            countDownTimer = new CountDownTimer(timerSeekBar.getProgress() * 1000 + 100, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {

                    updateTimer((int) millisUntilFinished / 1000);

                }

                @Override
                public void onFinish() {

                    resetTimer();
                    mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.worst);
                    mPlayer.start();

                }
            }.start();
        }else {
            resetTimer();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timerSeekBar = (SeekBar) findViewById(R.id.timerSeekBar);
        timerTextView = (TextView) findViewById(R.id.timerTextView);
        controllerButton = (Button) findViewById(R.id.controllerButton);

        timerSeekBar.setMax(600);
        timerSeekBar.setProgress(10);

        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateTimer(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }





}
