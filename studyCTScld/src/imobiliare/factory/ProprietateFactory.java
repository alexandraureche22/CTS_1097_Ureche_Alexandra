package imobiliare.factory;

public class ProprietateFactory {
    public static Proprietate creeazaProprietate(TipProprietate tip, String adresa, double suprafata, double pret) throws Exception {
        switch (tip){
            case CASA : return new Casa(adresa, suprafata, pret);
            case TEREN : return new Teren(adresa, suprafata, pret);
            case APARTAMENT:  return new Apartament(adresa, suprafata, pret);
            default: throw new Exception("tip invalid.");
        }
    }
}
