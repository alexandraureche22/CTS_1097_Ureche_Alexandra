package combinatii2.builder;

public class BiletAvion {
    private boolean areBagaj;
    private boolean arePrioritate;
    private boolean areLocLaGeam;
    private boolean areMasaSpeciala;
    private boolean areAsigurare;

    public BiletAvion(boolean areBagaj, boolean arePrioritate, boolean areLocLaGeam, boolean areMasaSpeciala, boolean areAsigurare) {
        this.areBagaj = areBagaj;
        this.arePrioritate = arePrioritate;
        this.areLocLaGeam = areLocLaGeam;
        this.areMasaSpeciala = areMasaSpeciala;
        this.areAsigurare = areAsigurare;
    }

    @Override
    public String toString() {
        return "BiletAvion{" +
                "areBagaj=" + areBagaj +
                ", arePrioritate=" + arePrioritate +
                ", areLocLaGeam=" + areLocLaGeam +
                ", areMasaSpeciala=" + areMasaSpeciala +
                ", areAsigurare=" + areAsigurare +
                '}';
    }
}
