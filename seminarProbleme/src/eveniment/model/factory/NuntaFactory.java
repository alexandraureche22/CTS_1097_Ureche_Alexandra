package eveniment.model.factory;

public class NuntaFactory extends PachetMethod{
    @Override
    public PachetServicii creeaza() {
        return new PachetNunta();
    }
}
