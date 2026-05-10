package cafenea.prototype;


public class BauturaPresetata implements Cloneable{
    private String tip;
    private String nume;
    private double pret;
    private int volum;

    public BauturaPresetata(String tip, String nume, double pret, int volum) {
        this.tip = tip;
        this.nume = nume;
        this.pret = pret;
        this.volum = volum;
    }
    public BauturaPresetata(BauturaPresetata alta) {
        this.tip = alta.tip;
        this.nume = alta.nume;
        this.pret = alta.pret;
        this.volum = alta.volum;
    }

    public String getTip() {
        return tip;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public int getVolum() {
        return volum;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }

    @Override
    public String toString() {
        return "BauturaPresetata{" +
                "tip='" + tip + '\'' +
                ", nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
    }

    @Override
    protected BauturaPresetata clone() throws CloneNotSupportedException {
        return new BauturaPresetata(this);
    }
}
