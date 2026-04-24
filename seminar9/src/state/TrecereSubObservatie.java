package state;

public class TrecereSubObservatie implements Stari{
    @Override
    public void interneaza() {
        System.out.println("Pacientul a iesit de sub observatie, este doar internat");
    }

    @Override
    public void trecereSubObservatie() {
        System.out.println("Nu mai e sub observatie");
    }

    @Override
    public void externeaza() {
        System.out.println("Pacientul poate fi externat");

    }
}
