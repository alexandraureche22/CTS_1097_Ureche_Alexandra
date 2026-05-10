package proxy.restaurant;

public class Rezervare
{
    private String numeClient;
    private int nrPersoane;

    public Rezervare(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
