package state;

public class Externare implements Stari{
    @Override
    public void interneaza() {
        System.out.println("Pacientul va fi reinternat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Nu mai e sub observatie, caci nu e internat");
    }

    @Override
    public void externeaza() {
        System.out.println("Pacientul este externat");

    }
}
