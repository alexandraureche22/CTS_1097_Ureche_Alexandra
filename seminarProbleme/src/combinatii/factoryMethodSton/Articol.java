package combinatii.factoryMethodSton;

public abstract class Articol {
    private String model;
    private double pret;

    public Articol(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    public abstract void afiseaza();
}
