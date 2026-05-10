package combinatii.protoSingleton;

public class FisaMedicala implements IFisaMedicala{
    private String nrFisa;
    private String numePacient;
    private String istoricDetalii;

    public FisaMedicala(String nrFisa, String numePacient, String istoricDetalii) {
        this.nrFisa = nrFisa;
        this.numePacient = numePacient;
        this.istoricDetalii = istoricDetalii;
    }
    public FisaMedicala(FisaMedicala alta) {
        this.nrFisa = alta.nrFisa;
        this.numePacient = alta.numePacient;
        this.istoricDetalii = alta.istoricDetalii;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public String toString() {
        return "FisaMedicala{" +
                "nrFisa='" + nrFisa + '\'' +
                ", numePacient='" + numePacient + '\'' +
                ", istoricDetalii='" + istoricDetalii + '\'' +
                '}';
    }

    @Override
    public IFisaMedicala cloneaza() {
        return new FisaMedicala(this);
    }
}
