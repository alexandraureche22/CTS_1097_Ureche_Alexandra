package aperativ;

public abstract class AFelPrincipal {
    protected String nume;
    protected boolean esteRece;

    public AFelPrincipal(String nume, boolean esteRece) {
        this.nume = nume;
        this.esteRece = esteRece;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteRece() {
        return esteRece;
    }

    @Override
    public String toString() {
        return "AFelPrincipal{" +
                "nume='" + nume + '\'' +
                ", esteRece=" + esteRece +
                '}';
    }

    public abstract void serveste();
}
