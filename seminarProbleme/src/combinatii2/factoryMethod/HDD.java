package combinatii2.factoryMethod;

public class HDD extends Stocare{
    public HDD(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("HDD: "+getNume()+"|"+getPret());
    }
}
