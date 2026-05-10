package designInterior;

public class Dulap extends AMobilier{
    public Dulap(String nume, String material, float pret) {
        super(nume, material, pret);
    }


    @Override
    public void afiseaza() {
        System.out.println("Dulap{" +
                "nume='" + nume + '\'' +
                ", material='" + material + '\'' +
                ", pret=" + pret +
                '}');
    }
}
