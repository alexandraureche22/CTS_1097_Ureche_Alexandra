package restaurant.factoryMethod;

import java.util.List;

public class Papanasi implements IPreparat {
    private double pret;
    private List<String> ingrediente;

    public Papanasi(double pret, List<String> ingrediente) {
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseaza() {
        System.out.println("Papanasi{" +
                "pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
