package combinatii.factorySton;

public abstract class Dispozitiv implements IPrototype {
    private String model;
    private double pret;

    public Dispozitiv(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }
    public Dispozitiv(Dispozitiv alt) {
        this.model = alt.model;
        this.pret = alt.pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

   public abstract void afiseaza();
}
