package iar.builder;

public class PacientBuilder implements IPacientBuilder{
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean areHalat;
    private boolean arePapuci;

    private static PacientBuilder instance;
    public static PacientBuilder getInstance(){
        if(instance==null){
            instance=new PacientBuilder();
        }
        return instance;
    }
    private PacientBuilder(){reset();}

    private void reset() {
        this.nume = "necunoscut";
        this.arePatRabatabil = false;
        this.areMicDejunInclus = false;
        this.areHalat = false;
        this.arePapuci = false;
    }

    @Override
    public Pacient build() {
        Pacient pacient = new Pacient(nume,arePatRabatabil,areMicDejunInclus,areHalat,arePapuci);
        reset();
        return pacient;
    }

    @Override
    public IPacientBuilder setNume(String nume) {
        this.nume=nume;
        return this;
    }

    @Override
    public IPacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil=arePatRabatabil;
        return this;
    }

    @Override
    public IPacientBuilder setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus=areMicDejunInclus;
        return this;
    }

    @Override
    public IPacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuci=arePapuciDeCamera;
        return this;
    }

    @Override
    public IPacientBuilder setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalat=areHalatPentruInterior;
        return this;
    }
}
