package cafenea.factory;

public class CiocolataCalda implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    public CiocolataCalda(String nume, double volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public double getVolum() {
        return volum;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Cafea{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void preparare() {
        System.out.println("Se pune apa sau laptele la fiert");
        System.out.println("Se pune praful de ciocolata in cana");
        System.out.println("Se adauga frisca");
        System.out.println("Se adauga topping");

    }
}
