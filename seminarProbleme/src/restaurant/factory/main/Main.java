package restaurant.factory.main;

import restaurant.factory.ISupa;
import restaurant.factory.SupaFactory;
import restaurant.factory.TipSupa;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        ISupa supa1 = SupaFactory.creeaza(TipSupa.SUPA_CIUPERCI,12.99, List.of("ciuperci","fidea"));
        ISupa supa2 = SupaFactory.creeaza(TipSupa.SUPA_LEGUME,20.99, List.of("rosii","fidea","ciuperci",
                "ardei rosu"));
        ISupa supa3 = SupaFactory.creeaza(TipSupa.SUPA_VITA,31.00, List.of("vita","fidea","rosii","legume tocate mixt"));
        ISupa supa4 = SupaFactory.creeaza(TipSupa.SUPA_LEGUME,10.99, List.of("ciuperci","fidea","bucati pui"));
        supa1.afiseaza();
        supa2.afiseaza();
        supa3.afiseaza();
        supa4.afiseaza();
    }
}
