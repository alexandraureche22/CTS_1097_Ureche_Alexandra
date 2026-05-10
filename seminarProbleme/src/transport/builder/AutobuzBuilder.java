package transport.builder;

public class AutobuzBuilder implements IAutobuz{
    private String model;
    private String sofer;
    private boolean areOpriri;
    private String capatLinie;
    private boolean deschidereUsiAutomat;
    private String textEcran;

    public AutobuzBuilder(String model) {
        this.model = model;
        this.sofer = "necunoscut";
        this.areOpriri = false;
        this.capatLinie = "necunoscut";
        this.deschidereUsiAutomat = false;
        this.textEcran = "necunscut";
    }

    public AutobuzBuilder setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public AutobuzBuilder setAreOpriri(boolean areOpriri) {
        this.areOpriri = areOpriri;
        return this;
    }

    public AutobuzBuilder setCapatLinie(String capatLinie) {
        this.capatLinie = capatLinie;
        return this;
    }

    public AutobuzBuilder setDeschidereUsiAutomat(boolean deschidereUsiAutomat) {
        this.deschidereUsiAutomat = deschidereUsiAutomat;
        return this;
    }

    public AutobuzBuilder setTextEcran(String textEcran) {
        this.textEcran = textEcran;
        return this;
    }

    @Override
    public AutobuzLinie build() {
        return new AutobuzLinie(model,sofer,areOpriri,capatLinie,deschidereUsiAutomat,textEcran);
    }
}
