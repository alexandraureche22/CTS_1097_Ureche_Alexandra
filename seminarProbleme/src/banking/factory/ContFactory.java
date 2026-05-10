package banking.factory;

public class ContFactory {
    public static Account creeaza(String tip, String userId, double soldInitial) throws Exception {
        switch (tip){
            case "curent": return new ContCurent(userId,soldInitial);
            case "depozit": return new ContDepozit(userId,soldInitial);
            case "economii": return new ContEconomii(userId,soldInitial);
            default:throw new Exception("tip invalid");
        }
    }
}
