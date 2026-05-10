package restaurant.builder;

public class MeniuBuilder {
    private String numeEveniment;
    private int nrPersoane;
    private String aperitivAles;
    private String felPrincipal;
    private String desert;
    private String bautura;
    private boolean servireMasa;
    private boolean includeDecoratiuni;

    public MeniuBuilder(String numeEveniment, int nrPersoane) {
        this.numeEveniment = numeEveniment;
        this.nrPersoane = nrPersoane;
        this.aperitivAles = "necunoscut";
        this.felPrincipal = "necunoscut";
        this.desert = "necunoscut";
        this.bautura = "necunoscut";
        this.servireMasa = false;
        this.includeDecoratiuni = false;
    }

    public MeniuBuilder setAperitivAles(String aperitivAles) {
        this.aperitivAles = aperitivAles;
        return this;
    }

    public MeniuBuilder setFelPrincipal(String felPrincipal) {
        this.felPrincipal = felPrincipal;
        return this;
    }

    public MeniuBuilder setDesert(String desert) {
        this.desert = desert;
        return this;
    }

    public MeniuBuilder setBautura(String bautura) {
        this.bautura = bautura;
        return this;
    }

    public MeniuBuilder setServireMasa(boolean servireMasa) {
        this.servireMasa = servireMasa;
        return this;
    }

    public MeniuBuilder setIncludeDecoratiuni(boolean includeDecoratiuni) {
        this.includeDecoratiuni = includeDecoratiuni;
        return this;
    }
    public Meniu build(){
        return new Meniu(numeEveniment,nrPersoane,aperitivAles,felPrincipal,desert,bautura,servireMasa,includeDecoratiuni);
    }
}
