package restaurant.factory;

import java.util.List;

public class FelPrincipal implements Preparat{
    private String nume;
    private double pret;
    private List<String> ingrediente;

    public FelPrincipal(String nume, double pret, List<String> ingrediente) {
        this.nume = nume;
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println( "FelPrincipal{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
