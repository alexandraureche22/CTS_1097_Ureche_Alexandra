package pizzerie.prototype;

public class PizzaPresetata implements Cloneable{
    private String tip;
    private String nume;
    private double pret;
    private int volum;

    public PizzaPresetata(String tip, String nume, double pret, int volum) {
        this.tip = tip;
        this.nume = nume;
        this.pret = pret;
        this.volum = volum;
    }
    public PizzaPresetata(PizzaPresetata alta) {
        this.tip = alta.tip;
        this.nume = alta.nume;
        this.pret = alta.pret;
        this.volum = alta.volum;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    @Override
    protected PizzaPresetata clone() throws CloneNotSupportedException {
        return new PizzaPresetata(this);
    }

    @Override
    public String toString() {
        return "PizzaPresetata{" +
                "tip='" + tip + '\'' +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
    }
}
