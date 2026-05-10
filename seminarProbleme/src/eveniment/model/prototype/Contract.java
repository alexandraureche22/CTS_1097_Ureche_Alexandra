package eveniment.model.prototype;

public class Contract implements Cloneable{
    private String nume;
    private double pret;
    private String clauze;

    public Contract(String clauze) {
        this.nume="";
        this.pret=0;
        this.clauze = clauze;
    }
    public Contract(Contract alt) {
        this.nume="alt.nume";
        this.pret=0;
        this.clauze = alt.clauze;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", clauze='" + clauze + '\'' +
                '}';
    }

    @Override
    public Contract clone() throws CloneNotSupportedException {
        return new Contract(this);
    }
}
