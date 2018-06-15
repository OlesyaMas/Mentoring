package com.gmail.maslyuk.lesya.mentoring.dateobserver;

public interface CurrentDateObservable {

    void registerObserver(CurrentDateObserver o);

    void removeObserver(CurrentDateObserver o);

    void notifyObservers();

}
