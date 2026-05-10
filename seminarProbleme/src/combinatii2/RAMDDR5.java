package combinatii2;

import combinatii2.factoryMethod.Stocare;

public class RAMDDR5 extends Stocare {
    public RAMDDR5(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("RAMDDR5: "+getNume()+"|"+getPret());
    }
}
