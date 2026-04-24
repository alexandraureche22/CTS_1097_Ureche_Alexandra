package state;

public class Internare implements  Stari{
    @Override
    public void interneaza() {
        System.out.println("Pacientul este internat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Pacientul a fost trecut sub observatie.");
    }

    @Override
    public void externeaza() {
        System.out.println("Nu se externeaza");

    }
}
