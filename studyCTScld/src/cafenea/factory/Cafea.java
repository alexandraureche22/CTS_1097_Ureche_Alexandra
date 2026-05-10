package cafenea.factory;

public class Cafea implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    public Cafea(String nume, double volum, double pret) {
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
        System.out.println("Se pune apa la fiert");
        System.out.println("Se pune cafeaua in filtru");
        System.out.println("Se adauga sirop");
        System.out.println("Se adauga lapte");

    }
}
