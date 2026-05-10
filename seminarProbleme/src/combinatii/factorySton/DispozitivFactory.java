package combinatii.factorySton;

public class DispozitivFactory {
    public static Dispozitiv creeaza(TipDispozitiv tip, String model, double pret) throws Exception {
        switch (tip){
            case PRIZE : return new Prize(model,pret);
            case SENZORI: return new Senzori(model,pret);
            case BECURI: return new Becuri(model,pret);
            default: throw new Exception("invalid");
        }
    }
}
