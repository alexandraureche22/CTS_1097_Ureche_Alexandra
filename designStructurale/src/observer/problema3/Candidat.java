package observer.problema3;

public class Candidat implements Observer{
    private String nume;

    public Candidat(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        System.out.println("Candidatul a primit mesajul: "+mesaj);
    }
}
