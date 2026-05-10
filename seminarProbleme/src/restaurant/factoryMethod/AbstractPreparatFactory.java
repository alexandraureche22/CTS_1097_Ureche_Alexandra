package restaurant.factoryMethod;

import java.util.List;

public abstract class AbstractPreparatFactory {
    public abstract IPreparat creeaza(Tip tip, double pret, List<String> ingrediente) throws Exception;
}
