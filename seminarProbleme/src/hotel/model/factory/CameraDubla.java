package hotel.model.factory;

public class CameraDubla implements ICamera {
    private String facilitate;
    private double pret;
    private int nrCamera;
    private double suprafata;

    public CameraDubla(String facilitate, double pret, int nrCamera, double suprafata) {
        this.facilitate = facilitate;
        this.pret = pret;
        this.nrCamera = nrCamera;
        this.suprafata = suprafata;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public double getSuprafata() {
        return suprafata;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("CameraDubla{" +
                "tip='" + facilitate + '\'' +
                ", pret=" + pret +
                ", nrCamera=" + nrCamera +
                ", suprafata=" + suprafata +
                '}');
    }

    @Override
    public String toString() {
        return "CameraDubla{" +
                "tip='" + facilitate + '\'' +
                ", pret=" + pret +
                ", nrCamera=" + nrCamera +
                ", suprafata=" + suprafata +
                '}';
    }

    @Override
    public String getFacilitati() {
        return facilitate;
    }

    @Override
    public double getPretNoapte() {
        return pret;
    }
}
