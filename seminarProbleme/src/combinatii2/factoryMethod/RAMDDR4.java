package combinatii2.factoryMethod;

public class RAMDDR4 extends Stocare{
    public RAMDDR4(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("RAMDDR4: "+getNume()+"|"+getPret());
    }

}
