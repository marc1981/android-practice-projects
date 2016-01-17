package com.example.marc.higherlowergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random randomNumber = new Random();

    public void matchNumber(View view){

        int randomGuess = randomNumber.nextInt(51);

        EditText myNumber = (EditText) findViewById(R.id.numberSubmit);
        Integer userNumber = Integer.parseInt(myNumber.getText().toString());
        if(userNumber == randomGuess){

            Toast.makeText(getApplicationContext(), "Your number, " + userNumber + ", matches the computer's!", Toast.LENGTH_LONG).show();

        } else if(userNumber > randomGuess){
            Toast.makeText(getApplicationContext(), "Your number, " + userNumber + ", is greater than the computer's!", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(getApplicationContext(), "Your number, " + userNumber + ", is less than the computer's!", Toast.LENGTH_LONG).show();
        }

        Log.i("Computer Guess,", "The computer's number is " + randomGuess);

    }

    public void lottoPick(View view){

        int firstNum = randomNumber.nextInt(61);
        int secondNum = randomNumber.nextInt(61);
        int thirdNum = randomNumber.nextInt(61);
        int fourthNum = randomNumber.nextInt(61);
        int fifthNum = randomNumber.nextInt(61);
        int powerBall = randomNumber.nextInt(61);
        Toast.makeText(getApplicationContext(), firstNum + " - " + secondNum + " - " + thirdNum + " - " + fourthNum + " - " + fifthNum + " - " + powerBall, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
