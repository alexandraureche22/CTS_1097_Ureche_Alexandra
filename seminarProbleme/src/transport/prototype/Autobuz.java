package transport.prototype;

public class Autobuz implements IPrototype{
    private String numar;
    private int nrLocuri;

    public Autobuz(String numar, int nrLocuri) {
        this.numar = numar;
        this.nrLocuri = nrLocuri;
    }
    public Autobuz(Autobuz altul) {
        this.numar = altul.numar;
        this.nrLocuri = altul.nrLocuri;
    }

    public String getNumar() {
        return numar;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numar='" + numar + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    @Override
    public IPrototype cloneaza() {
        return new Autobuz(numar,nrLocuri);
    }
}
