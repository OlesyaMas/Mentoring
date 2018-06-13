package maslyuk.lesya.gmail.com.impl;
import maslyuk.lesya.gmail.com.CurrentDateObservable;
import maslyuk.lesya.gmail.com.CurrentDateObserver;
import java.util.*;

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
        for (CurrentDateObserver observer : observers)
            observer.update(date);

    }
}
