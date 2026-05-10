package composite.spital;

public abstract class StructuraSpital {
    private String nume;

    public StructuraSpital(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public abstract void afiseazaIerarhie(String indentare);

    public void adaugaStructura(StructuraSpital structura) {
        throw new UnsupportedOperationException("Nu se poate adauga.");
    }

    public void stergeStructura(StructuraSpital structura) {
        throw new UnsupportedOperationException("Nu se poate sterge.");
    }
}
