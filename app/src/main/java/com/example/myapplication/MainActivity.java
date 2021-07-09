package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    String username;

    public static final String SEND_NAME = "com.example.myapplication.SEND_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainScreen(View view){
        name = findViewById(R.id.editTextTextPersonName);
        username = name.getText().toString();

        Intent intent = new Intent(this, GoogleOrCalculateActivity.class);
        intent.putExtra(SEND_NAME, username);
        startActivity(intent);
    }
}