package flyweight.spital;

public class Salon {
    private float numar_salon;
    private int numar_pat;
    private int numar_zile;

    public Salon(float numar_salon, int numar_pat, int numar_zile) {
        this.numar_salon = numar_salon;
        this.numar_pat = numar_pat;
        this.numar_zile = numar_zile;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "numar_salon=" + numar_salon +
                ", numar_pat=" + numar_pat +
                ", numar_zile=" + numar_zile +
                '}';
    }
}
