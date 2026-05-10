package imobiliare.factory;

public class Apartament implements Proprietate{
    private String adresa;
    private double suprafata;
    private double pret;

    public Apartament(String adresa, double suprafata, double pret) {
        this.adresa = adresa;
        this.suprafata = suprafata;
        this.pret = pret;
    }

    @Override
    public String getAdresa() {
        return adresa;
    }

    @Override
    public double getSuprafata() {
        return suprafata;
    }

    @Override
    public double getPret() {
        return pret;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Apartament{" +
                "adresa='" + adresa + '\'' +
                ", suprafata=" + suprafata +
                ", pret=" + pret +
                '}');
    }
}
