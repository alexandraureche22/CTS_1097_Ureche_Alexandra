package hotel.model.factory;

public class CameraSingle implements ICamera {
    private String facilitati;
    private double pret;
    private int nrCamera;
    private double suprafata;

    public CameraSingle(String tip, double pret, int nrCamera, double suprafata) {
        this.facilitati = tip;
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
        System.out.println("Suite{" +
                "facilitati='" + facilitati + '\'' +
                ", pret=" + pret +
                ", nrCamera=" + nrCamera +
                ", suprafata=" + suprafata +
                '}');
    }

    @Override
    public String toString() {
        return "Suite{" +
                "facilitati='" + facilitati + '\'' +
                ", pret=" + pret +
                ", nrCamera=" + nrCamera +
                ", suprafata=" + suprafata +
                '}';
    }

    @Override
    public String getFacilitati() {
        return facilitati;
    }

    @Override
    public double getPretNoapte() {
        return pret;
    }
}
