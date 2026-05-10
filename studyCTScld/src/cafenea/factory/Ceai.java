package cafenea.factory;

public class Ceai implements Bautura{
    private String nume;
    private double volum;
    private double pret;

    public Ceai(String nume, double volum, double pret) {
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
        return "Ceai{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public void preparare() {
        System.out.println("Se pune apa la fiert");
        System.out.println("Se pune plicul de ceai in cana");
        System.out.println("Se adauga miere");
        System.out.println("Se adauga lapte optional");

    }
}
