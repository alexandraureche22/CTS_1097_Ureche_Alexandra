package imobiliare.builder;

public class Cerere implements ICerereClient{
    private String oras;
    private String tip;
    private double suprafataMinima;
    private double suprafataMaxima;
    private double pretMinim;
    private double pretMaxim;
    private int nrCamere;
    private int etaj;

    public Cerere(String oras, String tip, double suprafataMinima, double suprafataMaxima, double pretMinim, double pretMaxim, int nrCamere, int etaj) {
        this.oras = oras;
        this.tip = tip;
        this.suprafataMinima = suprafataMinima;
        this.suprafataMaxima = suprafataMaxima;
        this.pretMinim = pretMinim;
        this.pretMaxim = pretMaxim;
        this.nrCamere = nrCamere;
        this.etaj = etaj;
    }

    @Override
    public String getOras() {
        return oras;
    }

    @Override
    public void afiseazaCerere() {
        System.out.println("Cerere{" +
                "oras='" + oras + '\'' +
                ", tip=" + tip +
                ", suprafataMinima=" + suprafataMinima +
                ", suprafataMaxima=" + suprafataMaxima +
                ", pretMinim=" + pretMinim +
                ", pretMaxim=" + pretMaxim +
                ", nrCamere=" + nrCamere +
                ", etaj=" + etaj +
                '}');
    }
}
