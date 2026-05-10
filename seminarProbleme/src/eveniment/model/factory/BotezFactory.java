package eveniment.model.factory;

public class BotezFactory extends PachetMethod{
    @Override
    public PachetServicii creeaza() {
        return new PachetBotez();
    }
}
