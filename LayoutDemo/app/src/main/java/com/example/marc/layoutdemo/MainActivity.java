package com.example.marc.layoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView krusty = (ImageView) findViewById(R.id.krusty);
        ImageView moe = (ImageView) findViewById(R.id.moe);

        if(krusty.getAlpha() == 1) {
            krusty.animate().alpha(0f).setDuration(1000);
            moe.animate().alpha(1f).setDuration(2000);
        }else if(moe.getAlpha() == 1){
            moe.animate().alpha(0f).setDuration(1000);
            krusty.animate().alpha(1f).setDuration(2000);
        }
    }

    public void enterNick(View view){
        ImageView nick = (ImageView) findViewById(R.id.nick);
        ImageView krusty = (ImageView) findViewById(R.id.krusty);
        ImageView moe = (ImageView) findViewById(R.id.moe);
        nick.animate().alpha(1f).setDuration(2000);
        krusty.animate().alpha(0f).setDuration(500);
    }

    public void moveNick(View view){
        ImageView nick = (ImageView) findViewById(R.id.nick);
        ImageView chief = (ImageView) findViewById(R.id.chief);
        if(nick.getAlpha() == 1) {
            nick.animate().translationXBy(1000f).setDuration(3000);
            chief.animate().translationXBy(1000f).setDuration(3000);
        }
    }

    public void chiefSpin(View view){
        ImageView chief = (ImageView) findViewById(R.id.chief);
        chief.animate().scaleX(0.5f).scaleY(0.5f).setDuration(4000);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView chief = (ImageView) findViewById(R.id.chief);
        chief.setTranslationX(-1000f);
    }
}
