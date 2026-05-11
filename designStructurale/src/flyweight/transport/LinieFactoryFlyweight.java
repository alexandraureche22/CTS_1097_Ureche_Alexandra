package flyweight.transport;

import java.util.HashMap;
import java.util.Map;

public class LinieFactoryFlyweight {
    private static Map<String, Flyweight> flyweightMap = new HashMap<>();
    public static Flyweight getFlyweight(int numar_linie, String prima_statie, String ultima_statie) {
        if (!flyweightMap.containsKey(String.valueOf(numar_linie))){
            flyweightMap.put(String.valueOf(numar_linie), new LinieFlyweight(new Linie(numar_linie, prima_statie, ultima_statie)));
        }
        return flyweightMap.get(String.valueOf(numar_linie));
    }
}
