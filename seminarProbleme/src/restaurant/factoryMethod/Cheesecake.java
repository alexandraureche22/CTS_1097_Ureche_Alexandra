package restaurant.factoryMethod;

import java.util.List;

public class Cheesecake implements IPreparat {
    private double pret;
    private List<String> ingrediente;

    public Cheesecake(double pret, List<String> ingrediente) {
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseaza() {
        System.out.println("Cheesecake{" +
                "pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
