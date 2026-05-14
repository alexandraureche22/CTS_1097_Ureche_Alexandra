package chainofresponsability.spital;

public class Client {
    private String nume;
    private String telefon;
    private String adresa;

    public Client(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getAdresa() {
        return adresa;
    }
}
