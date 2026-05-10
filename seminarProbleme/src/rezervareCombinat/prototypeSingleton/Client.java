package rezervareCombinat.prototypeSingleton;

public class Client implements IClient{
    private String nume;
    private String numarTelefon;

    public String getNume() {
        return nume;
    }

    public Client(String nume, String numarTelefon) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
    }
    public Client(Client altul) {
        this.nume = altul.nume;
        this.numarTelefon = altul.numarTelefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", numarTelefon='" + numarTelefon + '\'' +
                '}';
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public IClient cloneaza() {
        return new Client(this);
    }
}
