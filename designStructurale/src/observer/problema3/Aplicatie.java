package observer.problema3;

public class Aplicatie extends Subject{
    private String nume;

    public Aplicatie(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void notifyObserver(String job) {
        super.notifyObserver("e un nou post disponibil: "+job);
    }
}
