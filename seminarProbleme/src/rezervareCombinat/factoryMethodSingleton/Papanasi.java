package rezervareCombinat.factoryMethodSingleton;

public class Papanasi extends FelDeMancare{
    @Override
    public String getDenumire() {
        return super.getDenumire();
    }
    public Papanasi(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Papanasi"+super.getDenumire());
    }
}
