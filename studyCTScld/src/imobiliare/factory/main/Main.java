package imobiliare.factory.main;

import imobiliare.factory.Proprietate;
import imobiliare.factory.ProprietateFactory;
import imobiliare.factory.TipProprietate;

public class Main {
    public static void main(String[] args) throws Exception {
        Proprietate proprietate1 = ProprietateFactory.creeazaProprietate(TipProprietate.APARTAMENT,
                "Std. Chibzuintei",120,500);
        Proprietate proprietate2 = ProprietateFactory.creeazaProprietate(TipProprietate.APARTAMENT,
                "Str. Maicuta", 50, 120);
        Proprietate proprietate4 = ProprietateFactory.creeazaProprietate(TipProprietate.CASA,
                "Str. Maracineni nr 3", 300, 750);
        Proprietate proprietate3 = ProprietateFactory.creeazaProprietate(TipProprietate.APARTAMENT,
                "Str. Lalelelor nr 10", 72, 100);
        proprietate1.afiseazaDetalii();
        proprietate2.afiseazaDetalii();
        proprietate3.afiseazaDetalii();
        proprietate4.afiseazaDetalii();

    }
}
