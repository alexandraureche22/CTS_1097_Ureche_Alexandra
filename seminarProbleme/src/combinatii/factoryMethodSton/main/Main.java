package combinatii.factoryMethodSton.main;

import combinatii.factoryMethodSton.*;

public class Main {
    public static void main(String[] args) throws Exception {
        IncaltaminteFactory i = IncaltaminteFactory.getInstance();
        HaineFactory h = HaineFactory.getInstance();

        Articol a1 = i.creeaza(TipIncaltaminte.PERFORMANTA,"sneakers",399);
        Articol a2 = i.creeaza(TipIncaltaminte.TIMP_LIBER,"crooks",139.2);

        Articol a3 = h.creeaza(TipHaine.PANTALONI,"blugi skinny",130);
        Articol a4 = h.creeaza(TipHaine.TRICOU,"six seven mood",90);

        a1.afiseaza();
        a2.afiseaza();
        a3.afiseaza();
        a4.afiseaza();
    }
}
