package rezervareCombinat.factoryMethodSingleton;

public abstract class FelDeMancare {
    private String denumire;

    public FelDeMancare(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }
    public abstract void afiseazaDetalii();
}
