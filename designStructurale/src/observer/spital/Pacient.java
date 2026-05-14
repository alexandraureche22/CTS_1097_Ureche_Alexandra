package observer.spital;

public class Pacient implements IObserver{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul a primit mesajul.");
    }
}
