package rezervareCombinat.builderSingleton;

public class Rezervare {
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areDecorareMasa;
    private boolean areMuzicaAmbientala;
    private boolean areAccesLaGenMuzica;

    public Rezervare(boolean areAsezareGeam, boolean areScauneErgonomice, boolean areDecorareMasa, boolean areMuzicaAmbientala, boolean areAccesLaGenMuzica) {
        this.areAsezareGeam = areAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areDecorareMasa = areDecorareMasa;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areAccesLaGenMuzica = areAccesLaGenMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areAsezareGeam=" + areAsezareGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areDecorareMasa=" + areDecorareMasa +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", areAccesLaGenMuzica=" + areAccesLaGenMuzica +
                '}';
    }
}
