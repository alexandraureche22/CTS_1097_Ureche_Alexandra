package strategy.problema1;

public class Cash implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("Plata se face cash.");
    }
}
