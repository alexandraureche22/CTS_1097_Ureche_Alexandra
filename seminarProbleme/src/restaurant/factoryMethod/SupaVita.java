package restaurant.factoryMethod;

import java.util.List;

public class SupaVita implements IPreparat {
    private double pret;
    private List<String> ingrediente;

    public SupaVita(double pret, List<String> ingrediente) {
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseaza() {
        System.out.println("SupaVita{" +
                "pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
