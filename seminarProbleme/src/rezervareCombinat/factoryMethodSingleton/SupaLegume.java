package rezervareCombinat.factoryMethodSingleton;

public class SupaLegume extends FelDeMancare{
    @Override
    public String getDenumire() {
        return super.getDenumire();
    }
    public SupaLegume(String denumire) {
        super(denumire);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa legume"+super.getDenumire());
    }
}
