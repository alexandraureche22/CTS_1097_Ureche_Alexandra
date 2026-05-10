package eveniment.model.factory;

public class CorporateFactory extends PachetMethod{
    @Override
    public PachetServicii creeaza() {
        return new PachetCorporate();
    }
}
