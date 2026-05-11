package flyweight.spital;

public class Pacient {
    private String nume;
    private String numar_telefon;
    private String adresa;

    public Pacient(String nume, String numar_telefon, String adresa) {
        this.nume = nume;
        this.numar_telefon = numar_telefon;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", numar_telefon='" + numar_telefon + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
