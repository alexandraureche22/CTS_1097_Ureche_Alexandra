package strategy.transport;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("S a platit cu card de calatorii");
    }
}
