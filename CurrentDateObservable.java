package maslyuk.lesya.gmail.com;

public interface CurrentDateObservable {

    void registerObserver(CurrentDateObserver o);
    void removeObserver(CurrentDateObserver o);
    void notifyObservers();

}
