package composite.hotel;

public abstract class Destinatie {
    private String nume;

    public Destinatie(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public abstract void afiseazaIerarhie(String indenare);
    public void adaugaDestinatie(Destinatie destinatie){
        throw new UnsupportedOperationException("nu se poate adauga");
    }
    public void stergeDestinatie(Destinatie destinatie){
        throw new UnsupportedOperationException("nu se poate sterge");
    }
}
