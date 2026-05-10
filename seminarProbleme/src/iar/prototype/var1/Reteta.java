package iar.prototype.var1;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaCloneable {
    private String nume;
    private Map<String, Double> solutii;

    public Reteta(String nume, Map<String, Double> solutii) {
        this.nume = nume;
        this.solutii = solutii;
    }

    public Reteta(Reteta alta) {
        this.nume = alta.nume;
        this.solutii = new HashMap<>(alta.solutii);
    }

    public String getNume() {
        return nume;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", solutii=" + solutii +
                '}';
    }

    @Override
    public RetetaCloneable cloneaza() {
        return new Reteta(this);
    }
}
