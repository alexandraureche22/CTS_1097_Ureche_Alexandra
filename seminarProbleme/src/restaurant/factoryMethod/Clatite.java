package restaurant.factoryMethod;

import java.util.List;

public class Clatite implements IPreparat {
    private double pret;
    private List<String> ingrediente;

    public Clatite(double pret, List<String> ingrediente) {
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseaza() {
        System.out.println("Clatite{" +
                "pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
