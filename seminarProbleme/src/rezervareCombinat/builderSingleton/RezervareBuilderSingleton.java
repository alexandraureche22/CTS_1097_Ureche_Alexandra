package rezervareCombinat.builderSingleton;

public class RezervareBuilderSingleton implements IRezervare {
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areDecorareMasa;
    private boolean areMuzicaAmbientala;
    private boolean areAccesLaGenMuzica;

    private static RezervareBuilderSingleton instance;
    private RezervareBuilderSingleton(){
        reset();
    }

    private void reset() {
        this.areAsezareGeam = false;
        this.areScauneErgonomice = false;
        this.areDecorareMasa = false;
        this.areMuzicaAmbientala = false;
        this.areAccesLaGenMuzica = false;

    }

    public static RezervareBuilderSingleton getInstance(){
        if(instance == null){
            instance = new RezervareBuilderSingleton();
        }
        return instance;
    }

    public RezervareBuilderSingleton setAreAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam = areAsezareGeam;
        return this;
    }

    public RezervareBuilderSingleton setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }

    public RezervareBuilderSingleton setAreDecorareMasa(boolean areDecorareMasa) {
        this.areDecorareMasa = areDecorareMasa;
        return this;
    }

    public RezervareBuilderSingleton setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public RezervareBuilderSingleton setAreAccesLaGenMuzica(boolean areAccesLaGenMuzica) {
        this.areAccesLaGenMuzica = areAccesLaGenMuzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(areAsezareGeam,areScauneErgonomice,areDecorareMasa,areMuzicaAmbientala,areAccesLaGenMuzica);
    }
}
