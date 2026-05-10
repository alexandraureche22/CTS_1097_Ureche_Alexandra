package restaurant.factoryMethod;

import java.util.List;

public class SupaFactory extends AbstractPreparatFactory{


    @Override
    public IPreparat creeaza(Tip tip, double pret, List<String> ingrediente) throws Exception {
        switch (tip){
            case TipSupa.SUPA_LEGUME: return new SupaLegume(pret, ingrediente);
            case TipSupa.SUPA_CIUPERCI: return new SupaVita(pret, ingrediente);
            case TipSupa.SUPA_VITA: return new SupaCiuperci(pret, ingrediente);
            default: throw new Exception("tip invalid");
        }
    }
}
