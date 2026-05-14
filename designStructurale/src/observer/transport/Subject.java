package observer.transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }
    public void adaugaObserver(Observer observer){
        observers.add(observer);
    }
    public void stergeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserv(String mesaj){
        for(Observer o:observers){
            o.anuntaCalatorii(mesaj);
        }
    }
}
