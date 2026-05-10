package cafenea.prototype;

public class Bautura implements Cloneable, IBautura {
    private String nume;
    private double pret;
    private int volum;

    public Bautura(String nume, double pret, int volum) {
        this.nume = nume;
        this.pret = pret;
        this.volum = volum;
    }
    public Bautura(Bautura altaBautura) {
        this.nume = altaBautura.nume;
        this.pret = altaBautura.pret;
        this.volum = altaBautura.volum;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
    }

    @Override
    public Bautura clone() throws CloneNotSupportedException {
        return new Bautura(this);
    }

    @Override
    public void preparare() {

    }

    @Override
    public String getDetalii() {
        return "miau miau";
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void adaugaTopping() {
        System.out.println("se adauga");
    }
}
