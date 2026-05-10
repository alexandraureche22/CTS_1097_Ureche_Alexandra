package rezervareCombinat.factoryMethodSingleton;

public class SupaCiuperci extends FelDeMancare{
    @Override
    public String getDenumire() {
        return super.getDenumire();
    }
    public SupaCiuperci(String denumire) {
        super(denumire);
    }
    @Override
    public void afiseazaDetalii() {
        System.out.println("Supa ciuperci "+super.getDenumire());
    }
}
