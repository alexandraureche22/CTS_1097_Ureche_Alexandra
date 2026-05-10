package restaurant.factory;

import java.util.List;

public class SupaLegume implements ISupa{
    private double pret;
    private List<String> ingrediente;

    public SupaLegume(double pret, List<String> ingrediente) {
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseaza() {
        System.out.println("SupaLegume{" +
                "pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
