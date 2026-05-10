package cafenea.singleton;

public class Cafea implements Bautura {
    private String nume;
    private double pret;
    private int volum;

    public Cafea(String nume, double pret, int volum) {
        this.nume = nume;
        this.pret = pret;
        this.volum = volum;
    }

    @Override
    public void preparare() {
        System.out.println("Se fierba apa sau laptele");
        System.out.println("Se adauga cafeaua");
        System.out.println("Se adauga sirop");
        System.out.println("Se adauga gheata(optional)");

    }

    @Override
    public String toString() {
        return "Cafea{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
    }

    @Override
    public String getDetalii() {
        String mesaj = "Cafea{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
        return mesaj ;
    }

    @Override
    public double getPret() {
        return pret;
    }
}
