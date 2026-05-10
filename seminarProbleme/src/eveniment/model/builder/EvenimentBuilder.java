package eveniment.model.builder;

public class EvenimentBuilder implements IEveniment{
    private String data;
    private String locatie;
    private String nume;

    private boolean areServiciiFoto;
    private boolean areServiciiCatering;
    private String dj;
    private boolean areDecoratiuniFlorale;
    private boolean cabinaFoto;

    public EvenimentBuilder(String data, String locatie, String nume) {
        this.data = data;
        this.locatie = locatie;
        this.nume = nume;
        this.areServiciiFoto = false;
        this.areServiciiCatering = false;
        this.dj = "necunoscut";
        this.areDecoratiuniFlorale = false;
        this.cabinaFoto = false;
    }

    public EvenimentBuilder setAreServiciiFoto(boolean areServiciiFoto) {
        this.areServiciiFoto = areServiciiFoto;
        return this;
    }

    public EvenimentBuilder setAreServiciiCatering(boolean areServiciiCatering) {
        this.areServiciiCatering = areServiciiCatering;
        return this;
    }

    public EvenimentBuilder setDj(String dj) {
        this.dj = dj;
        return this;
    }

    public EvenimentBuilder setAreDecoratiuniFlorale(boolean areDecoratiuniFlorale) {
        this.areDecoratiuniFlorale = areDecoratiuniFlorale;
        return this;
    }

    public EvenimentBuilder setCabinaFoto(boolean cabinaFoto) {
        this.cabinaFoto = cabinaFoto;
        return this;
    }

    @Override
    public Eveniment build() {
        return new Eveniment(data,locatie,nume,areServiciiFoto,areServiciiCatering,dj,areDecoratiuniFlorale,cabinaFoto);
    }
}
