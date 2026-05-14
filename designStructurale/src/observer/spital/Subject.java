package observer.spital;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public List<IObserver> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }
    public void addObserver(IObserver observer){
        observers.add(observer);
    }
    public void stergeObserver(IObserver observer){
        observers.remove(observer);
    }
    public void notifyObserver(String mesaj){
        for(IObserver o : observers){
            o.primesteNotificare(mesaj);
        }
    }
}
