package produs.factory.Main;

import produs.factory.ProdusFactory;
import produs.factory.ProdusGeneric;

public class Main {
    public static void main(String[] args) throws Exception {
        ProdusGeneric p1 = ProdusFactory.creeaza("bio","lapte",8.99,12,"lactate");
        ProdusGeneric p2 = ProdusFactory.creeaza("bio","avocado",12.99,8,"legume");
        ProdusGeneric p3 = ProdusFactory.creeaza("electronic","iphone 17",5400,50,"smartphone");
        ProdusGeneric p4 = ProdusFactory.creeaza("perisabil","lapte",53.49,12,"peste");
        p1.afiseazaDetalii();
        p2.afiseazaDetalii();
        p3.afiseazaDetalii();
        p4.afiseazaDetalii();
    }
}
