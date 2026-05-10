package designInterior.main;

import designInterior.*;

public class Main {
    public static void main(String[] args) {
        AMobilierFactory rustic = new Rustic();
        AMobilierFactory modern = new Modern();

        AMobilier d1 = modern.creeazaDulap("dulap super modern","lemn",199);
        AMobilier d2 = modern.creeazaDulap("dulap super rustic","pal",182);
        AMobilier m1 = modern.creeazaMasa("masa de cafea","sticla",723);
        AMobilier m2 = modern.creeazaMasa("masa living","lemn",193);
        AMobilier f1 = modern.creeazaFotoliu("folotlie piele crocodic","piele",195);
        AMobilier f2 = modern.creeazaFotoliu("dulap piele cangur","piele",176);

        d1.afiseaza();
        d2.afiseaza();
        m1.afiseaza();
        m2.afiseaza();
        f1.afiseaza();
        f2.afiseaza();

    }
}
