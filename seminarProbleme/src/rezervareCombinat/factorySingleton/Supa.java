package rezervareCombinat.factorySingleton;

public abstract class Supa {
    private String denumire;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

   public abstract void afiseaza();
}
