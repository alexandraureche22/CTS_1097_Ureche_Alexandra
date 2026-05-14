package observer.transport;

public class Autobuz extends Subject {
    private String nume;

    public Autobuz(String nume) {
        super();
        this.nume = nume;
    }
    public void pleacaDinStatie(String nume){
        System.out.println("Autobuzul: "+this.nume+"pleaca din statie"+nume);
        super.notifyObserv("Autobuzul: "+this.nume+"a pleacat din statie"+nume);
    }
}
