package spital.builder;

public class Pacient {
    private String nume;
    private boolean arePat;
    private boolean areMicDejun;
    private boolean areHalat;
    private boolean arePapuci;

    public Pacient(String nume,boolean arePat, boolean areMicDejun, boolean areHalat, boolean arePapuci) {
        this.nume=nume;
        this.arePat = arePat;
        this.areMicDejun = areMicDejun;
        this.areHalat = areHalat;
        this.arePapuci = arePapuci;
    }

    public boolean isArePat() {
        return arePat;
    }

    public boolean isAreMicDejun() {
        return areMicDejun;
    }

    public boolean isAreHalat() {
        return areHalat;
    }

    public boolean isArePapuci() {
        return arePapuci;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", arePat=" + arePat +
                ", areMicDejun=" + areMicDejun +
                ", areHalat=" + areHalat +
                ", arePapuci=" + arePapuci +
                '}';
    }
}
