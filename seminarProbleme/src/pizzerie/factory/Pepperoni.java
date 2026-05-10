package pizzerie.factory;

public class Pepperoni implements Pizza{
    private String nume;
    private double dimensiune;
    private double pret;

    public Pepperoni(String nume, double dimensiune, double pret) {
        this.nume = nume;
        this.dimensiune = dimensiune;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Pepperoni{" +
                "nume='" + nume + '\'' +
                ", dimensiune=" + dimensiune +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void preparare() {
        System.out.println("pepperoni");
        System.out.println("se face aluatu");
        System.out.println("se pun ingredientele");
        System.out.println("se pune in cuptor");
        System.out.println("se serveste");

    }

    @Override
    public String getDetalii() {
        return "Pepperoni{" +
                "nume='" + nume + '\'' +
                ", dimensiune=" + dimensiune +
                ", pret=" + pret +
                '}';
    }

    @Override
    public double getPret() {
        return pret;
    }
}
