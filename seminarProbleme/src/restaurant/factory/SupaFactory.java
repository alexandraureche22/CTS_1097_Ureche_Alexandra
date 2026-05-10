package restaurant.factory;

import java.util.List;

public class SupaFactory {
    public static ISupa creeaza(TipSupa tip, double pret, List<String> ingrediente) throws Exception {
        switch (tip){
            case SUPA_CIUPERCI : return new SupaCiuperci(pret,ingrediente);
            case SUPA_LEGUME:  return new SupaLegume(pret,ingrediente);
            case SUPA_VITA:  return new SupaVita(pret,ingrediente);
            default: throw new Exception("tiup invalid.");
        }
    }
}
