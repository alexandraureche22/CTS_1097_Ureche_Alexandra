package produs.resgistry.Main;

import com.sun.security.jgss.GSSUtil;
import produs.factory.ProdusFactory;
import produs.factory.ProdusGeneric;
import produs.resgistry.ProdusBio;
import produs.resgistry.ProdusRegistry;

public class Main {
    public static void main(String[] args) throws Exception {
        ProdusRegistry produsRegistry = ProdusRegistry.getInstance();
        ProdusRegistry produsRegistry1 = ProdusRegistry.getInstance();
        System.out.println("sunt egale?"+(produsRegistry1==produsRegistry));

        ProdusGeneric p1 = ProdusFactory.creeaza("bio","lapte",8.99,12,"lactate");
        ProdusGeneric p2 = ProdusFactory.creeaza("bio","avocado",12.99,8,"legume");
        ProdusGeneric p3 = ProdusFactory.creeaza("electronic","iphone 17",5400,50,"smartphone");
        ProdusGeneric p4 = ProdusFactory.creeaza("perisabil","lapte",53.49,12,"peste");

        System.out.println("=====");
        produsRegistry.adaugaProdus(p1.getNume(),p1);
        produsRegistry.adaugaProdus(p2.getNume(),p2);
        produsRegistry.adaugaProdus(p1.getNume(),p1);
        System.out.println(produsRegistry.getProdus("lapte"));
        produsRegistry.afiseazaTotalProduse();
    }
}
