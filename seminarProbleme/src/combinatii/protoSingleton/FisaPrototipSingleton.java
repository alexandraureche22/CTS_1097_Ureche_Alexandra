package combinatii.protoSingleton;

import java.util.HashMap;
import java.util.Map;

public class FisaPrototipSingleton {
    private static FisaPrototipSingleton instance;
    Map<String, FisaMedicala> fise = new HashMap<>();

    private FisaPrototipSingleton() {
    }

    public static FisaPrototipSingleton getInstance(){
        if(instance==null){
            instance = new FisaPrototipSingleton();
        }
        return instance;
    }
    public void adauga(String nume, FisaMedicala fisa){
        fise.put(nume,fisa);
    }

    public FisaMedicala getFisa(String nume){
        if(fise.containsKey(nume)){
            return (FisaMedicala) fise.get(nume).cloneaza();
        }
        return null;

    }

    @Override
    public String toString() {
        return "FisaPrototipSingleton{" +
                "fise=" + fise +
                '}';
    }
}
