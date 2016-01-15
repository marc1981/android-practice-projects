package com.example.marc.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText myDollar = (EditText) findViewById(R.id.dollars);
        Double dollarAmount = Double.parseDouble(myDollar.getText().toString());
        Double euroAmount = dollarAmount * 0.92;
        Toast.makeText(getApplicationContext(), "This is equal to  " + euroAmount + " Euros.", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
