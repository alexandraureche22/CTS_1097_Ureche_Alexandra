package prototype.simplu;

public class Atestat implements IAtestat,ICloneaza{
    private String sigiliu;
    private String logo;
    private String nume;
    private String cnp;
    private String diagnostic;

    public Atestat(String sigiliu, String logo) {
        this.sigiliu = sigiliu;
        this.logo = logo;
        this.nume = "necunoscut";
        this.cnp = "necunoscut";
        this.diagnostic = "necunoscut";
    }
    public Atestat(Atestat altul) {
        this.sigiliu = altul.sigiliu;
        this.logo = altul.logo;
        this.nume = altul.nume;
        this.cnp = altul.cnp;
        this.diagnostic = altul.diagnostic;
    }

    @Override
    public String toString() {
        return "Atestat{" +
                "sigiliu='" + sigiliu + '\'' +
                ", logo='" + logo + '\'' +
                ", nume='" + nume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Atestat{" +
                "sigiliu='" + sigiliu + '\'' +
                ", logo='" + logo + '\'' +
                ", nume='" + nume + '\'' +
                ", cnp='" + cnp + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                '}');
    }

    @Override
    public IAtestat cloneaza() {
        return new Atestat(this);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
