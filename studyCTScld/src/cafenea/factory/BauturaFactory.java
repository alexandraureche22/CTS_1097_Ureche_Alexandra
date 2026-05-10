package cafenea.factory;

public class BauturaFactory {
    public static Bautura creeaza(Tip tip, String nume, double volum, double pret) throws Exception {
        switch (tip){
            case CEAI : return new Ceai(nume, volum, pret);
            case CAFEA : return new Cafea(nume, volum, pret);
            case CIOCOLATA_CALDA: return new CiocolataCalda(nume, volum, pret);
            default: throw new Exception("tip invalid.");
        }
    }
}
