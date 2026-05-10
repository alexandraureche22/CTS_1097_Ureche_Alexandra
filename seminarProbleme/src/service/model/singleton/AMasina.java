package service.model.singleton;

public abstract class AMasina {
    private String nume;
    private double valoare;

    public AMasina(String nume, double valoare) {
        this.nume = nume;
        this.valoare=valoare;
    }

    public String getNume() {
        return nume;
    }

    public double getValoare() {
        return valoare;
    }

    @Override
    public String toString() {
        return "AMasina{" +
                "nume='" + nume + '\'' +
                ", valoare=" + valoare +
                '}';
    }
}
