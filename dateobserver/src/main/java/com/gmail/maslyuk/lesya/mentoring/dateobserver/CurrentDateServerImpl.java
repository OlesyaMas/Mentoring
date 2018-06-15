package com.gmail.maslyuk.lesya.mentoring.dateobserver;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CurrentDateServerImpl implements CurrentDateObservable {

    private List<CurrentDateObserver> observers;
    private Date date;

    public CurrentDateServerImpl() {
        observers = new LinkedList<>();
    }


    @Override
    public void registerObserver(CurrentDateObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(CurrentDateObserver o) {
        observers.remove(o);
    }

    public void setDate(Date date) {
        this.date = date;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (CurrentDateObserver observer : observers) {
            observer.update(date);
        }

    }
}
