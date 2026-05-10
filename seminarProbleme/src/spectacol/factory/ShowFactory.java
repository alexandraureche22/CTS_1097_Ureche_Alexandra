package spectacol.factory;

import java.util.List;

public class ShowFactory {
    public static IShow creeaza(String tip, String nume, String locatie, String data, Object obj1,
                                Object obj2) throws Exception {
        switch (tip){
            case "concert": return new Concert(nume,locatie,data, (String) obj1, (List<String>) obj2);
            case "standup": return new Standup(nume,locatie,data, (Boolean) obj1, (List<String>) obj2);
            case "teatru": return new Teatru(nume,locatie,data, (String) obj1, (List<String>) obj2);
            default:throw new Exception("tip invalid");
        }
    }
}
