package observer.problema2;

public class Sofer implements IObserver{
    private String nume;

    public Sofer(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Soferul "+this.nume+" a primit mesajul: "+mesaj);

    }
}
