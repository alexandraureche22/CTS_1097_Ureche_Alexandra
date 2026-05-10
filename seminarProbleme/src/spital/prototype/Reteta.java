package spital.prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements IReteta{
    private String nume;
    private Map<String,Double> map;

    public Reteta(String nume, Map<String, Double> map) {
        this.nume = nume;
        this.map = map;
    }
    public Reteta(Reteta altaReteta) {
        this.nume = altaReteta.nume;
        this.map = new HashMap<>(altaReteta.map);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public IReteta cloneaza() {
        return new Reteta(this);
    }

    @Override
    public String
    toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", map=" + map +
                '}';
    }
}
