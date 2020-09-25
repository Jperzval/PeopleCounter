package com.example.peoplecounter.presenter;

import android.content.SharedPreferences;

import com.example.peoplecounter.Contract;
import com.example.peoplecounter.model.Counter;

/**
 * Created to override methods of Presenter. This allows information to operate without the
 * data and UI being held up by the other.
 */
public class CounterPresenter implements Contract.Presenter {

    private static final String TOTAL_COUNT = "Total";
    private static final String CURRENT_COUNT = "Current";

    private Contract.View counterView;
    private SharedPreferences sharedPreferences;
    private Counter counter;

    public CounterPresenter(Contract.View counterView, SharedPreferences sharedPreferences, Counter counter) {
        this.counterView = counterView;
        this.sharedPreferences = sharedPreferences;
        this.counter = counter;
    }

    @Override
    public void onCounterStart() {

    }

    @Override
    public void increasePeopleCount() {

    }

    @Override
    public void decreasePeopleCount() {

    }

    @Override
    public void resetCount() {

    }

    @Override
    public void getSavedCount() {

    }
}
