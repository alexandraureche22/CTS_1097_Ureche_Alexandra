package imobiliare.builder;

public class CerereBuilder {
    private String oras;
    private String tip;
    private double suprafataMinima;
    private double suprafataMaxima;
    private double pretMinim;
    private double pretMaxim;
    private int nrCamere;
    private int etaj;

    public CerereBuilder(String oras) {
        this.oras = oras;
        this.tip = "necunoscut";
        this.suprafataMinima = 0.0;
        this.suprafataMaxima = 0.0;
        this.pretMinim = 0.0;
        this.pretMaxim = 0.0;
        this.nrCamere = 0;
        this.etaj = 0;
    }

    public CerereBuilder setSuprafataMinima(double suprafataMinima) {
        this.suprafataMinima = suprafataMinima;
        return this;
    }

    public CerereBuilder setSuprafataMaxima(double suprafataMaxima) {
        this.suprafataMaxima = suprafataMaxima;
        return this;
    }

    public CerereBuilder setPretMinim(double pretMinim) {
        this.pretMinim = pretMinim;
        return this;
    }

    public CerereBuilder setPretMaxim(double pretMaxim) {
        this.pretMaxim = pretMaxim;
        return this;
    }

    public CerereBuilder setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
        return this;
    }

    public CerereBuilder setEtaj(int etaj) {
        this.etaj = etaj;
        return this;
    }

    public CerereBuilder setTip(String tip) {
        this.tip = tip;
        return this;

    }
    public Cerere build(){
        return new Cerere(oras,tip,suprafataMinima,suprafataMaxima,pretMinim,pretMaxim,nrCamere,etaj);
    }
}
