package rezervareCombinat.factoryMethodSingleton;

public class SupaVita extends FelDeMancare{
    @Override
    public String getDenumire() {
        return super.getDenumire();
    }

    public SupaVita(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa vita"+super.getDenumire());
    }
}
