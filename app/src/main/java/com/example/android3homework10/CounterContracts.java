package com.example.android3homework10;

public interface CounterContracts {
    interface CounterView{
        void updateCounter(int count);
    }
    interface Presenter{
        void increment();
        void attachView(CounterView counterView);
        void decrease();
    }
}
