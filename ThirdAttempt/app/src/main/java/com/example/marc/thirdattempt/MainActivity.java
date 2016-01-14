package com.example.marc.thirdattempt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
        //Type   Variable Name  Convert     Find element by ID
        EditText myTextField = (EditText) findViewById(R.id.textField);

        Log.i("TextField Value", myTextField.getText().toString());

    }

    public void nameFunction(View view){

        EditText myNameField = (EditText) findViewById(R.id.nameField);
        Log.i("NameField Value,", "My name is " + myNameField.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
