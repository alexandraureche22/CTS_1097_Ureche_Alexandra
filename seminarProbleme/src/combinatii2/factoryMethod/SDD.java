package combinatii2.factoryMethod;

public class SDD extends Stocare{
    public SDD(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("SDD: "+getNume()+"|"+getPret());
    }
}
