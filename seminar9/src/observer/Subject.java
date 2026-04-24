package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public List<Observer> observers;

    public Subject(){
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObserver(String mesaj){
        for(Observer o: observers){
            o.primesteNotificare(mesaj);
        }
    }
}