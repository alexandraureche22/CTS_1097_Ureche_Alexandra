package observer.transport;

public class Calator implements Observer{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void anuntaCalatorii(String mesaj) {
        System.out.println("Calatorul "+this.nume+"a fost anuntat: "+mesaj);
    }
}
