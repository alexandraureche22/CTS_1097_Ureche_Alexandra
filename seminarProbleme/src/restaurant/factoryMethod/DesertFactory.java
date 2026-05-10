package restaurant.factoryMethod;

import java.util.List;

public class DesertFactory extends AbstractPreparatFactory{

    @Override
    public IPreparat creeaza(Tip tip, double pret, List<String> ingrediente) throws Exception {
        switch (tip){
            case TipDesert.PAPANASI : return new Papanasi(pret, ingrediente);
            case TipDesert.CLATITE : return new Clatite(pret, ingrediente);
            case TipDesert.CHEESECAKE : return new Cheesecake(pret, ingrediente);
            default:throw new Exception("tip invalid");
        }
    }
}
