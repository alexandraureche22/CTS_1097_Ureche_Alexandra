package restaurantprototypegreu.factory;

public class FelFactory {
    public static IFelMancare creeaza(String tip, String nume, String detalii, double pret) throws Exception {
        switch (tip){
            case "aperitiv": return new Aperitiv(nume, detalii, pret);
            case "desert": return new Desert(nume, detalii, pret);
            case "felprincipal": return new FelPrincipal(nume, detalii, pret);
            default:throw new Exception("tip invalid");
        }
    }
}
