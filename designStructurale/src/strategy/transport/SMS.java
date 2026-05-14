package strategy.transport;

public class SMS implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("S a platit prin sms");
    }
}
