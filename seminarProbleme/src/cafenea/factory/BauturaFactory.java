package cafenea.factory;

public class BauturaFactory {
    public static Bautura creeaza(String tip, String nume, double pret, int volum) throws Exception {
        switch (tip){
            case "cafea":return new Cafea(nume,pret,volum);
            case "ceai":return new Ceai(nume,pret,volum);
            case "ciocolatacalda":return new CiocolataCalda(nume,pret,volum);
            default:throw new Exception("tip invalid");
        }
    }
}
