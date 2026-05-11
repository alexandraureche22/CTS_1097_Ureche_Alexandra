package flyweight.spital;

import java.util.HashMap;
import java.util.Map;

public class PacientFlyweightFactory {
    private static Map<String, Flyweight> flyweightMap = new HashMap<>();
    public static Flyweight getFlyweight(String nume, String numar_telefon, String adresa){
        if(!flyweightMap.containsKey(numar_telefon)){
            flyweightMap.put(numar_telefon, new PacientFlyweight(new Pacient(numar_telefon,numar_telefon,adresa)));
        }
        return flyweightMap.get(numar_telefon);
    }
}
