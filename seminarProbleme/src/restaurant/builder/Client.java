package restaurant.builder;

public class Client {
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areDecorareMasa;
    private boolean areMuzicaAmbientala;
    private boolean areAccesLaGenMuzica;

    public Client(boolean areAsezareGeam, boolean areScauneErgonomice, boolean areDecorareMasa, boolean areMuzicaAmbientala, boolean areAccesLaGenMuzica) {
        this.areAsezareGeam = areAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areDecorareMasa = areDecorareMasa;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.areAccesLaGenMuzica = areAccesLaGenMuzica;
    }

    public boolean isAreAsezareGeam() {
        return areAsezareGeam;
    }

    public boolean isAreScauneErgonomice() {
        return areScauneErgonomice;
    }

    public boolean isAreDecorareMasa() {
        return areDecorareMasa;
    }

    public boolean isAreMuzicaAmbientala() {
        return areMuzicaAmbientala;
    }

    public boolean isAreAccesLaGenMuzica() {
        return areAccesLaGenMuzica;
    }

    @Override
    public String toString() {
        return "Client{" +
                "areAsezareGeam=" + areAsezareGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areDecorareMasa=" + areDecorareMasa +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", areAccesLaGenMuzica=" + areAccesLaGenMuzica +
                '}';
    }
}
