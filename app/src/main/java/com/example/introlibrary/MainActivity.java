package com.example.introlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.Informations;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Informations.Toaster(this,"welcome to new library");
    }
}