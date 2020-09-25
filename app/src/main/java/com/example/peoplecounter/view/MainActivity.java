package com.example.peoplecounter.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.peoplecounter.Contract;
import com.example.peoplecounter.R;

public class MainActivity extends AppCompatActivity implements Contract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void displayTotalCount(int total) {
        
    }

    @Override
    public void displayCurrentCount(int currentCount) {

    }

    @Override
    public void changeTextColorToRed() {

    }

    @Override
    public void changeTextColorToPrimaryDark() {

    }

    @Override
    public void hideMinusButton() {

    }

    @Override
    public void showMinusButton() {

    }
}