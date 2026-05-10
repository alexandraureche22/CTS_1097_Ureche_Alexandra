package restaurantprototypegreu.factory;

public class Desert implements IFelMancare {
    private String nume;
    private String detalii;
    private double pret;

    public Desert(String nume, String detalii, double pret) {
        this.nume = nume;
        this.detalii = detalii;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "nume='" + nume + '\'' +
                ", detalii='" + detalii + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void preparare() {
        System.out.println("se face aluat");
        System.out.println("se coace");
        System.out.println("se serveste");
    }

    @Override
    public String getDetalii() {
        return detalii;
    }

    @Override
    public double getPret() {
        return pret;
    }
}
