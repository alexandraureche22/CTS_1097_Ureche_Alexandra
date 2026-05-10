package designInterior;

public class Fotoliu extends AMobilier{
    public Fotoliu(String nume, String material, float pret) {
        super(nume, material, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Fotoliu{" +
                "nume='" + nume + '\'' +
                ", material='" + material + '\'' +
                ", pret=" + pret +
                '}');
    }
}
