package designInterior;

public class Masa extends AMobilier{
    public Masa(String nume, String material, float pret) {
        super(nume, material, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Masa{" +
                "nume='" + nume + '\'' +
                ", material='" + material + '\'' +
                ", pret=" + pret +
                '}');
    }
}
