package observer.problema2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<IObserver> observers;

    public Subject() {
        this.observers= new ArrayList<>();
    }
     public void notifyObserver(String mesaj){
        for(IObserver o:observers){
            o.primesteNotificare(mesaj);

        }
    }
    public void adaugaNotificare(IObserver observer){
        observers.add(observer);
    }
    public void stergeNotificare(IObserver observer){
        observers.remove(observer);
    }
}
