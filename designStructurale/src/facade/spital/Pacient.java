package facade.spital;

public class Pacient {
    private int numar;
    private String nume;
    private int stareGravitate;

    public Pacient(int numar, String nume, int stareGravitate) {
        this.numar = numar;
        this.nume = nume;
        this.stareGravitate = stareGravitate;
    }
    public Pacient(Pacient altPacient) {
        this.numar = altPacient.numar;
        this.nume = altPacient.nume;
        this.stareGravitate = altPacient.stareGravitate;
    }

    public int getNumar() {
        return numar;
    }

    public String getNume() {
        return nume;
    }

    public int getStareGravitate() {
        return stareGravitate;
    }

    public boolean areStareGrava() {
        return this.getStareGravitate() > 2;
    }
    @Override
    public String toString() {
        return "Pacient{" +
                "numar=" + numar +
                ", nume='" + nume + '\'' +
                ", stareGravitate=" + stareGravitate +
                '}';
    }
}
