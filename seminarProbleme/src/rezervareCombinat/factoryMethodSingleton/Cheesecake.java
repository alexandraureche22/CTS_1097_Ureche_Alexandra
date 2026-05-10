package rezervareCombinat.factoryMethodSingleton;

public class Cheesecake extends FelDeMancare{
    @Override
    public String getDenumire() {
        return super.getDenumire();
    }
    public Cheesecake(String denumire) {
        super(denumire);
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Cheesecake"+super.getDenumire());
    }
}
