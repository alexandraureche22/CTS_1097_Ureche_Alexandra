package combinatii2.builder;

public class BiletBuilder implements IBilet{
    private boolean areBagaj;
    private boolean arePrioritate;
    private boolean areLocLaGeam;
    private boolean areMasaSpeciala;
    private boolean areAsigurare;

    private static BiletBuilder instance;
    private void BiletAvion(){
        reset();
    }

    private void reset() {
        this.areBagaj = false;
        this.arePrioritate = false;
        this.areLocLaGeam = false;
        this.areMasaSpeciala = false;
        this.areAsigurare = false;
    }
    public static BiletBuilder getInstance(){
        if(instance==null){
            instance = new BiletBuilder();
        }
        return instance;
    }
    public BiletBuilder setAreBagaj(boolean areBagaj) {
        this.areBagaj = areBagaj;
        return this;
    }

    public BiletBuilder setArePrioritate(boolean arePrioritate) {
        this.arePrioritate = arePrioritate;
        return this;
    }

    public BiletBuilder setAreLocLaGeam(boolean areLocLaGeam) {
        this.areLocLaGeam = areLocLaGeam;
        return this;
    }

    public BiletBuilder setAreMasaSpeciala(boolean areMasaSpeciala) {
        this.areMasaSpeciala = areMasaSpeciala;
        return this;
    }

    public BiletBuilder setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
        return this;
    }

    @Override
    public BiletAvion build() {
        return new BiletAvion(areBagaj,arePrioritate,areLocLaGeam,areMasaSpeciala,areAsigurare);
    }
}
