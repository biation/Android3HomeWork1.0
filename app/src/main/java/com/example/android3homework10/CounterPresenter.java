package com.example.android3homework10;


public class CounterPresenter implements CounterContracts.Presenter{
    CounterModel counterModel;
    CounterContracts.CounterView counterView;

    public CounterPresenter() {
        counterModel = new CounterModel();
    }

    @Override
    public void increment() {
        counterModel.increment();
        counterView.updateCounter(counterModel.getCount());
        }

    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }

    @Override
    public void decrease() {
        counterModel.decrease();
        counterView.updateCounter(counterModel.getCount());
    }
}
