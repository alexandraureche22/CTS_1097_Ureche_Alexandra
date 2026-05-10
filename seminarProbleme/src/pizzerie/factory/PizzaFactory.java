package pizzerie.factory;

public class PizzaFactory {
    public static Pizza creeaza(String tip, String nume, double diametru, double pret) throws Exception {
        switch (tip){
            case "diavola": return new Diavola(nume,diametru,pret);
            case "margherita": return new Margherita(nume,diametru,pret);
            case "pepperoni": return new Pepperoni(nume, diametru, pret);
            default:throw new Exception("tip invalid");
        }
    }
}
