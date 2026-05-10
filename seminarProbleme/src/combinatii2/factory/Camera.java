package combinatii2.factory;

public abstract class Camera  {
    private int nrPersoane;
    private double pret;

    public Camera(int nrPersoane, double pret) {
        this.nrPersoane = nrPersoane;
        this.pret = pret;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

   public abstract void afiseaza();
}
