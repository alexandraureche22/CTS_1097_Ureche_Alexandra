package flyweight.hotel;

public class Rezervare {
    private int nrcamera;
    private int nrpersoane;
    private String ora;

    public Rezervare(int nrcamera, int nrpersoane, String ora) {
        this.nrcamera = nrcamera;
        this.nrpersoane = nrpersoane;
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrcamera=" + nrcamera +
                ", nrpersoane=" + nrpersoane +
                ", ora='" + ora + '\'' +
                '}';
    }
}
