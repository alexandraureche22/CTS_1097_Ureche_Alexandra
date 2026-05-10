package composite.transport;

public abstract class Flota {
    private String nume;

    public Flota(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public abstract void afisareIerarhie(String indenare);
    public void adaugaComponenta(Flota flota){
        throw new UnsupportedOperationException("nu se poate");
    }
    public void stergeComponenta(Flota flota){
        throw new UnsupportedOperationException("nu se poate");
    }

}
