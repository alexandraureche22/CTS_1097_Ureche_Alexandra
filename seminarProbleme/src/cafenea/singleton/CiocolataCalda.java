package cafenea.singleton;

public class CiocolataCalda implements Bautura {
    private String nume;
    private double pret;
    private int volum;
    @Override
    public void preparare() {
        System.out.println("Se fierba apa sau laptele");
        System.out.println("Se adauga praful de ciocolata");
        System.out.println("Se adauga frisca");
        System.out.println("Se adauga topping");

    }

    @Override
    public String toString() {
        String mesaj = "CiocolataCalda{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
        return mesaj;
    }

    public CiocolataCalda(String nume, double pret, int volum) {
        this.nume = nume;
        this.pret = pret;
        this.volum = volum;
    }

    @Override
    public String getDetalii() {
        return "CiocolataCalda{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", volum=" + volum +
                '}';
    }

    @Override
    public double getPret() {
        return pret;
    }
}
