package restaurant.factoryMethod;
import java.util.List;

public class SupaCiuperci implements IPreparat {
    private double pret;
    private List<String> ingrediente;

    public SupaCiuperci(double pret, List<String> ingrediente) {
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public void afiseaza() {
        System.out.println("SupaCiuperci{" +
                "pret=" + pret +
                ", ingrediente=" + ingrediente +
                '}');
    }
}
