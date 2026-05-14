package observer.problema2;

public class Aplicatie extends Subject{
    private String nume;

    public Aplicatie(String nume) {
        this.nume = nume;
    }

    @Override
    public void notifyObserver(String comanda) {
        super.notifyObserver("comanda noua este: "+comanda);
    }
}
