package transport.builder;

public class AutobuzLinie {
    private String model;
    private String sofer;
    private boolean areOpriri;
    private String capatLinie;
    private boolean deschidereUsiAutomat;
    private String textEcran;

    public AutobuzLinie(String model, String sofer, boolean areOpriri, String capatLinie, boolean deschidereUsiAutomat, String textEcran) {
        this.model = model;
        this.sofer = sofer;
        this.areOpriri = areOpriri;
        this.capatLinie = capatLinie;
        this.deschidereUsiAutomat = deschidereUsiAutomat;
        this.textEcran = textEcran;
    }

    public String getModel() {

        return model;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean isAreOpriri() {
        return areOpriri;
    }

    public String getCapatLinie() {
        return capatLinie;
    }

    public boolean isDeschidereUsiAutomat() {
        return deschidereUsiAutomat;
    }

    public String getTextEcran() {
        return textEcran;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "model='" + model + '\'' +
                ", sofer='" + sofer + '\'' +
                ", areOpriri=" + areOpriri +
                ", capatLinie='" + capatLinie + '\'' +
                ", deschidereUsiAutomat=" + deschidereUsiAutomat +
                ", textEcran='" + textEcran + '\'' +
                '}';
    }
}
