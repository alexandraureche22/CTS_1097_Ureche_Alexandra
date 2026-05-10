package restaurant.factoryMethod.main;

import restaurant.factoryMethod.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractPreparatFactory absSupa = new SupaFactory();
        AbstractPreparatFactory absDesert = new DesertFactory();

        IPreparat p1 = absSupa.creeaza(TipSupa.SUPA_LEGUME,12.99, List.of("legume mixt","taitei"));
        IPreparat p2 = absDesert.creeaza(TipDesert.CLATITE,30.50,List.of("aluat","lapte","dulceata"));
        IPreparat p3 = absDesert.creeaza(TipDesert.PAPANASI,23.50,List.of("oua","lapte","nutella","banane"));
        p1.afiseaza();
        p2.afiseaza();
        p3.afiseaza();
    }
}
