package com.example.marc.username;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    public void submitInfo(View view){

        EditText myNameField = (EditText) findViewById(R.id.nameField);
        EditText myPasswordField = (EditText) findViewById(R.id.passwordField);
        Toast.makeText(getApplicationContext(), "Hello " + myNameField.getText().toString() + ".", Toast.LENGTH_LONG).show();
        Log.i("NamePassword Value", "User name: " + myNameField.getText().toString() + " | Password: " + myPasswordField.getText().toString());
    }

    public void changeImage(View view){
        ImageView myDogImage = (ImageView) findViewById(R.id.imageView);
        myDogImage.setImageResource(R.drawable.doggy);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
