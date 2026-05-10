package cafenea.singleton;

public class Ceai implements Bautura {
    private String nume;
    private double pret;
    private int volum;
    @Override
    public void preparare() {
        System.out.println("Se fierba apa");
        System.out.println("Se adauga plicul de ceai");
        System.out.println("Se lasa la infuzat");
        System.out.println("Se serveste");

    }

    @Override
    public String toString() {
        return "Ceai{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
    }

    public Ceai(String nume, double pret, int volum) {
        this.nume = nume;
        this.pret = pret;
        this.volum = volum;
    }

    @Override
    public String getDetalii() {
        String mesaj = "Ceai{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
        return mesaj;
    }

    @Override
    public double getPret() {
        return pret;
    }
}
