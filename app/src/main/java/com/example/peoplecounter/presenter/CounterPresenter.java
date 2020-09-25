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
        counterView.displayCurrentCount(counter.getCurrentCount());
        counterView.displayTotalCount(counter.getTotalCount());
        counterView.hideMinusButton();
    }

    @Override
    public void increasePeopleCount() {
        counter.setCurrentCount(counter.getCurrentCount() + 1);
        counter.setTotalCount(counter.getTotalCount() + 1);
        if (counter.getCurrentCount() > 0) counterView.showMinusButton();
        if (counter.getCurrentCount() > 15) counterView.changeTextColorToRed();
        counterView.displayCurrentCount(counter.getCurrentCount());
        counterView.displayTotalCount(counter.getTotalCount());
    }

    @Override
    public void decreasePeopleCount() {
        counter.setCurrentCount(counter.getCurrentCount() - 1);
        if (counter.getCurrentCount() < 1) counterView.hideMinusButton();
        if (counter.getCurrentCount() < 16) counterView.changeTextColorToPrimaryDark();
        counterView.displayCurrentCount(counter.getCurrentCount());
    }

    @Override
    public void resetCount() {
        counter.setTotalCount(0);
        counter.setCurrentCount(0);
        if (counter.getCurrentCount() < 1) counterView.hideMinusButton();
        counterView.changeTextColorToPrimaryDark();
        counterView.displayTotalCount(counter.getCurrentCount());
        counterView.displayCurrentCount(counter.getTotalCount());
    }

    @Override
    public void getSavedCount() {

    }

    private void saveCount(int current, int total) {

    }
}
