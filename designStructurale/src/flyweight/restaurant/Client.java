package flyweight.restaurant;

public class Client {
    private String nume;
    private String numar_telefon;
    private String adresa_mail;

    public Client(String nume, String numar_telefon, String adresa_mail) {
        this.nume = nume;
        this.numar_telefon = numar_telefon;
        this.adresa_mail = adresa_mail;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numar_telefon='" + numar_telefon + '\'' +
                ", adresa_mail='" + adresa_mail + '\'' +
                '}';
    }
}
