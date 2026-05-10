package restaurant.builder;

public class ClientBuilder implements IClient{
    private boolean areAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areDecorareMasa;
    private boolean areMuzicaAmbientala;
    private boolean areAccesLaGenMuzica;

    public ClientBuilder() {
        this.areAsezareGeam = false;
        this.areScauneErgonomice = false;
        this.areDecorareMasa = false;
        this.areMuzicaAmbientala = false;
        this.areAccesLaGenMuzica = false;
    }

    public ClientBuilder setAreAsezareGeam(boolean areAsezareGeam) {
        this.areAsezareGeam = areAsezareGeam;
        return this;
    }

    public ClientBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
        return this;
    }

    public ClientBuilder setAreDecorareMasa(boolean areDecorareMasa) {
        this.areDecorareMasa = areDecorareMasa;
        return this;
    }

    public ClientBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return  this;
    }

    public ClientBuilder setAreAccesLaGenMuzica(boolean areAccesLaGenMuzica) {
        this.areAccesLaGenMuzica = areAccesLaGenMuzica;
        return this;
    }

    @Override
    public String toString() {
        return "ClientBuilder{" +
                "areAsezareGeam=" + areAsezareGeam +
                ", areScauneErgonomice=" + areScauneErgonomice +
                ", areDecorareMasa=" + areDecorareMasa +
                ", areMuzicaAmbientala=" + areMuzicaAmbientala +
                ", areAccesLaGenMuzica=" + areAccesLaGenMuzica +
                '}';
    }

    @Override
    public Client build() {
        return new Client(areAsezareGeam,areScauneErgonomice,areDecorareMasa,areMuzicaAmbientala,areAccesLaGenMuzica);
    }
}
