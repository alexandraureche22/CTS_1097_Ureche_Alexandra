package combinatii2.factory;

public class Standard extends Camera{
    public Standard(int nrPersoane, double pret) {
        super(nrPersoane, pret);
    }
    @Override
    public void afiseaza() {
        System.out.println("Standard: "+getNrPersoane()+" | "+getPret());

    }
}
