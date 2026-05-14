package strategy.spital;

public class ModCash implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("Se plateste cash");
    }
}
