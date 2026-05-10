package service.model.singleton;

public class Masina extends AMasina{
    public Masina(String nume, double valoare) {
        super(nume, valoare);
    }

    @Override
    public String toString() {
        return "Masina{}"+super.toString();
    }
}
