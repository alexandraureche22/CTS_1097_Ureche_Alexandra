package restaurant.factory;

import java.util.List;

public class PreparatFactory {
    public static Preparat creeazaPreparat(TipPreparat tip, String nume, double pret, List<String> ingrediente) throws Exception {
        switch (tip){
            case DESERT : return new Desert(nume,pret,ingrediente);
            case FEL_PRINCIPAL:  return new FelPrincipal(nume,pret,ingrediente);
            case APERITIV:  return new Aperitiv(nume,pret,ingrediente);
            default : throw new Exception("tip invalid.");
        }
    }
}
