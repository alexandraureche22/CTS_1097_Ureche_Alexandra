package spital.builder;

public class PacientBuilder {
    private String nume; //ca numele va fi obligatoriu, rstul optionale
    private boolean arePat;
    private boolean areMicDejun;
    private boolean areHalat;
    private boolean arePapuci;

    public PacientBuilder(String nume) {
        this.nume=nume;
        this.arePat = false;
        this.areMicDejun = false;
        this.areHalat = false;
        this.arePapuci = false;
    }

    public PacientBuilder setArePat(boolean arePat) {
        this.arePat = arePat;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setAreHalat(boolean areHalat) {
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilder setArePapuci(boolean arePapuci) {
        this.arePapuci = arePapuci;
        return this;
    }
    public Pacient build(){
        return new Pacient(nume,arePat,areMicDejun,areHalat,arePapuci);
    }
}
