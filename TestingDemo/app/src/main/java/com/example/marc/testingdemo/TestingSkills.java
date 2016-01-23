package com.example.marc.testingdemo;

import android.media.Image;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class TestingSkills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_skills);
    }

    public void soundSpin(View view){

        MediaPlayer mPlayer = MediaPlayer.create(this, R.raw.one);

        ImageView mic = (ImageView) findViewById(R.id.mic);

        mic.animate().scaleY(1.5f).scaleX(1.5f).setDuration(3000);

        mPlayer.start();
    }

}
