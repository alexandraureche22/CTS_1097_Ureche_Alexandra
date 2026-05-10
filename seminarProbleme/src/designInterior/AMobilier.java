package designInterior;

public abstract class AMobilier {
    protected String nume;
    protected String material;
    protected float pret;

    public AMobilier(String nume, String material, float pret) {
        this.nume = nume;
        this.material = material;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public String getMaterial() {
        return material;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "AMobilier{" +
                "nume='" + nume + '\'' +
                ", material='" + material + '\'' +
                ", pret=" + pret +
                '}';
    }
    public abstract void afiseaza();
}
