package flyweight.restaurant;

import java.util.HashMap;
import java.util.Map;

public class ClientFactoryFlyweight{
    private static Map<String,Flyweight> flyweightMap = new HashMap<>();
    public static Flyweight getFlyweight(String nume, String numar_telefon, String adresa_mail){
        if(!flyweightMap.containsKey(numar_telefon)){
            flyweightMap.put(numar_telefon, new ClientFlyweight(new Client(nume, numar_telefon, adresa_mail)));
        }
        return flyweightMap.get(numar_telefon);
    }
}
