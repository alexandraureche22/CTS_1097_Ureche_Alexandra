package eveniment.model.builder;

public class Eveniment {
    private String data;
    private String locatie;
    private String nume;

    private boolean areServiciiFoto;
    private boolean areServiciiCatering;
    private String dj;
    private boolean areDecoratiuniFlorale;
    private boolean cabinaFoto;

    public Eveniment(String data, String locatie, String nume, boolean areServiciiFoto, boolean areServiciiCatering, String dj, boolean areDecoratiuniFlorale, boolean cabinaFoto) {
        this.data = data;
        this.locatie = locatie;
        this.nume = nume;
        this.areServiciiFoto = areServiciiFoto;
        this.areServiciiCatering = areServiciiCatering;
        this.dj = dj;
        this.areDecoratiuniFlorale = areDecoratiuniFlorale;
        this.cabinaFoto = cabinaFoto;
    }

    public String getData() {
        return data;
    }

    public String getLocatie() {
        return locatie;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreServiciiFoto() {
        return areServiciiFoto;
    }

    public boolean isAreServiciiCatering() {
        return areServiciiCatering;
    }

    public String getDj() {
        return dj;
    }

    public boolean isAreDecoratiuniFlorale() {
        return areDecoratiuniFlorale;
    }

    public boolean isCabinaFoto() {
        return cabinaFoto;
    }

    @Override
    public String toString() {
        return "Eveniment{" +
                "data='" + data + '\'' +
                ", locatie='" + locatie + '\'' +
                ", nume='" + nume + '\'' +
                ", areServiciiFoto=" + areServiciiFoto +
                ", areServiciiCatering=" + areServiciiCatering +
                ", dj='" + dj + '\'' +
                ", areDecoratiuniFlorale=" + areDecoratiuniFlorale +
                ", cabinaFoto=" + cabinaFoto +
                '}';
    }
}
