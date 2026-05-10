package cafenea.singleton.main;

import cafenea.factory.Bautura;
import cafenea.singleton.BauturaComanda;
import cafenea.singleton.BauturaSingleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BauturaSingleton bauturaSingleton = BauturaSingleton.getInstance();
        BauturaSingleton bauturaSingleton1 = BauturaSingleton.getInstance();
        System.out.println("egale? "+(bauturaSingleton1==bauturaSingleton));

        BauturaComanda b1= new BauturaComanda("cafea",350,10.99);
        BauturaComanda b2= new BauturaComanda("ceai",500,8.50);
        bauturaSingleton.adaugaBautura(b1);
        bauturaSingleton.adaugaBautura(b2);
        System.out.println(bauturaSingleton.calculeazaPretTotal());
        bauturaSingleton.afiseazaComanda();
    }
}
