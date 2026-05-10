package restaurant.factory.main;

import restaurant.factory.Preparat;
import restaurant.factory.PreparatFactory;
import restaurant.factory.TipPreparat;

import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Preparat preparat1 = PreparatFactory.creeazaPreparat(TipPreparat.DESERT,"lava cake",
                19.99,List.of("oua","lapte","cacao"));
        Preparat  preparat2 = PreparatFactory.creeazaPreparat(TipPreparat.APERITIV,"platou salam",
                25.78,List.of("salam","masline","branza","castraveti"));
        Preparat preparat3 = PreparatFactory.creeazaPreparat(TipPreparat.FEL_PRINCIPAL,"ciorba de vacuta",
                21.49,List.of("ciorba","ardei iute","smanatana"));
        preparat1.afiseazaDetalii();
        preparat2.afiseazaDetalii();
        preparat3.afiseazaDetalii();

    }
}
