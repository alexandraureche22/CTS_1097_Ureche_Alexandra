package livrareMancareSub1Zamfi.factory;

public class NotificareFactory {
    public static NotificareSistem creeaza(String tip, String tag, String mesaj, String oraTrimiterii) throws Exception {
        switch (tip){
            case "confirmare": return new NotificareConfirmare(tag, mesaj, oraTrimiterii);
            case "livrare": return new NotificareLivrare(tag, mesaj, oraTrimiterii);
            case "promotie": return new NotificarePromotie(tag, mesaj, oraTrimiterii);
            default:throw new Exception("tip invalid");
        }
    }
}
