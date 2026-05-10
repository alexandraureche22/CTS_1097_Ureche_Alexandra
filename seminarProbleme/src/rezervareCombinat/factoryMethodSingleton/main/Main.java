package rezervareCombinat.factoryMethodSingleton.main;

import rezervareCombinat.factoryMethodSingleton.*;
import rezervareCombinat.factorySingleton.Supa;

public class Main {
    public static void main(String[] args) throws Exception {
        SupaFactory s = SupaFactory.getInstance();
        DesertFactory d = DesertFactory.getInstance();

        FelDeMancare f1 = s.creeaza(TipSupa.CIUPERCI,"supa crema");
        FelDeMancare f2 = d.creeaza(TipDesert.CHEESECAKE,"prajitura cu branza");
        FelDeMancare f3 = s.creeaza(TipSupa.CIUPERCI,"supa vita");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
