package composite.restaurant;

public abstract class Meniu {
    private String nume;

    public Meniu(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public abstract void afiseazaMneiu(String indentare);
    public void adaugaComponenta(Meniu meniu){
        throw  new UnsupportedOperationException("nu se poate.");
    }
    public void stergeComponenta(Meniu meniu){
        throw new UnsupportedOperationException("nu se poate");
    }
}
