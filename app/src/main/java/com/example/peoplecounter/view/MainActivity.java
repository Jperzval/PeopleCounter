package com.example.peoplecounter.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.peoplecounter.Contract;
import com.example.peoplecounter.R;
import com.example.peoplecounter.model.Counter;
import com.example.peoplecounter.presenter.CounterPresenter;

public class MainActivity extends AppCompatActivity implements Contract.View {

    private static final String SHARED_PREF_KEY = "SharedPref";
    private Contract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREF_KEY, MODE_PRIVATE);
        Counter counter = new Counter(0, 0);
        presenter = new CounterPresenter(this, sharedPreferences, counter);
        presenter.onCounterStart();
        onPlusButtonClick();
        onMinusButtonClick();
        onResetButtonClick();
        presenter.getSavedCount();
    }

    private void onPlusButtonClick() {
        Button plusButton = findViewById(R.id.button_plus);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { presenter.increasePeopleCount();
            }
        });
    }

    private void onMinusButtonClick() {
        Button minusButton = findViewById(R.id.button_minus);
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { presenter.decreasePeopleCount();
            }
        });
    }

    private void onResetButtonClick() {
        Button resetButton = findViewById(R.id.button_reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.resetCount();
            }
        });
    }

    @Override
    public void displayTotalCount(int totalCount) {
        TextView textViewTotalCount = findViewById(R.id.text_view_total_count);
        String total = getResources().getString(R.string.text_view_total_count, totalCount);
        textViewTotalCount.setText(total);
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