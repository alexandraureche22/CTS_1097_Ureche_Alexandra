package iar.builder;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean areHalat;
    private boolean arePapuci;

    public Pacient(String nume, boolean arePatRabatabil, boolean areMicDejunInclus, boolean areHalat, boolean arePapuci) {
        this.nume = nume;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.areHalat = areHalat;
        this.arePapuci = arePapuci;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePatRabatabil=" + arePatRabatabil +
                ", areMicDejunInclus=" + areMicDejunInclus +
                ", areHalat=" + areHalat +
                ", arePapuci=" + arePapuci +
                '}';
    }
}
