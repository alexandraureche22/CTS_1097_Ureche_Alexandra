package strategy.transport;


public class CardBancar implements ModPlata {
    @Override
    public void plateste() {
        System.out.println("S a platit cu card bancar");
    }
}
