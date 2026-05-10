package combinatii2.factory;

public class Apartament extends Camera {
    public Apartament(int nrPersoane, double pret) {
        super(nrPersoane, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Apartament: " + getNrPersoane() + " | " + getPret());

    }

}
