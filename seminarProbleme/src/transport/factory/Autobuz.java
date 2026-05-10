package transport.factory;

public class Autobuz implements IMijloc{
    private String numar;
    private int nrLocuri;

    public Autobuz(String numar, int nrLocuri) {
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
        System.out.println("Autobuz{" +
                "numar='" + numar + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}');

    }
}
