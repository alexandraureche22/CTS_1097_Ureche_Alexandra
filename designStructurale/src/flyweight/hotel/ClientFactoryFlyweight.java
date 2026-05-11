package flyweight.hotel;

import java.util.HashMap;
import java.util.Map;

public class ClientFactoryFlyweight {
    private static Map<String, Flyweight> flyweightMap = new HashMap<>();
    public static Flyweight getFlyweight(String nume, String telefon, String email){
        if(!flyweightMap.containsKey(telefon)){
            flyweightMap.put(telefon,new ClientFlyweight(new Client(nume, telefon, email)));
        }
        return flyweightMap.get(telefon);
    }
}
