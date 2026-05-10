package rezervareCombinat.factoryMethodSingleton;

public class Clatite extends FelDeMancare{
    @Override
    public String getDenumire() {
        return super.getDenumire();
    }
    public Clatite(String denumire) {
        super(denumire);
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Clatite"+super.getDenumire());
    }
}
