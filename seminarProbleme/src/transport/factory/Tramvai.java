package transport.factory;

public class Tramvai implements IMijloc{
    private String numar;
    private int nrLocuri;

    public Tramvai(String numar, int nrLocuri) {
        this.numar = numar;
        this.nrLocuri = nrLocuri;
    }

    public String getNumar() {
        return numar;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public void afiseaza() {
        System.out.println("Tramvai{" +
                "numar='" + numar + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}');

    }
}
