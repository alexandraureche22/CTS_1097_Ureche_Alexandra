package spectacol.factory;

public abstract class AShow implements IShow{
    private String nume;
    private String locatie;
    private String data;

    public AShow(String nume, String locatie, String data) {
        this.nume = nume;
        this.locatie = locatie;
        this.data = data;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public abstract void afiseazaDetalii();

    @Override
    public String toString() {
        return "AShow{" +
                "nume='" + nume + '\'' +
                ", locatie='" + locatie + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
