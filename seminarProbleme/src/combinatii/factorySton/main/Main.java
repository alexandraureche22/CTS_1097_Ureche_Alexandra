package combinatii.factorySton.main;

import combinatii.factorySton.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Dispozitiv d1 = DispozitivFactory.creeaza(TipDispozitiv.BECURI,"100volts",10);
        Becuri b1 = (Becuri) d1.cloneaza();
        System.out.println(b1);
        b1.afiseaza();
        Dispozitiv d2 = DispozitivFactory.creeaza(TipDispozitiv.PRIZE,"100volts",10);
        Prize p1 = (Prize) d2.cloneaza();
        p1.cloneaza();
        p1.afiseaza();
    }
}
