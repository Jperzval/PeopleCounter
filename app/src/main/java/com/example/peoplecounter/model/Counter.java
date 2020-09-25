package com.example.peoplecounter.model;
/**
 * Created to obtain count information
 */
public class Counter {

    private int totalCount;
    private int currentCount;

    public Counter(int totalCount, int currentCount) {
        this.totalCount = totalCount;
        this.currentCount = currentCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }
}
