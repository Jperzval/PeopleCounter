package com.example.peoplecounter;

/**
 * Created for MVP architecture. View interface will be implemented by MainActivity and
 * Presenter interface will be implemented by CounterPresenter class.
 */
public interface Contract {

    interface View {
        void displayTotalCount(int total);

        void displayCurrentCount(int currentCount);

        void changeTextColorToRed();

        void changeTextColorToPrimaryDark();

        void hideMinusButton();

        void showMinusButton();
    }

    interface Presenter {
        void onCounterStart();

        void increasePeopleCount();

        void decreasePeopleCount();

        void resetCount();

        void getSavedCount();
    }
}
