package cafenea.factory.main;

import cafenea.factory.Bautura;
import cafenea.factory.BauturaFactory;
import cafenea.factory.Tip;

public class Main {
    public static void main(String[] args) throws Exception {
        Bautura b1 = BauturaFactory.creeaza(Tip.CAFEA,"latte macchiato",250,12.99);
        Bautura b2 = BauturaFactory.creeaza(Tip.CAFEA,"macha",500,22.99);
        Bautura b3 = BauturaFactory.creeaza(Tip.CIOCOLATA_CALDA,"ciocolata macho choco",350,15.99);
        Bautura b4 = BauturaFactory.creeaza(Tip.CEAI,"ceai musetel",450,10.99);

        System.out.println(b1);
        b1.preparare();
        System.out.println(b2);
        b2.preparare();
        System.out.println(b3);
        b3.preparare();
        System.out.println(b4);
        b4.preparare();
    }
}
