package eveniment.model.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegistruContracte {
    private static RegistruContracte instance;
    private Map<String,Contract> map = new HashMap<>();

    private RegistruContracte(){}
    public static synchronized RegistruContracte getInstance(){
        if(instance==null){
            instance= new RegistruContracte();
        }
        return instance;
    }
    public void adaugaContract(String nume, Contract contract){
        if (map.containsKey(nume)) {
            System.out.println("Sablonul exisata deja");
        }
        else{
            map.put(nume,contract);
        }
    }
    public Contract getContract(String nume) throws CloneNotSupportedException {
        Contract existent = map.get(nume);
        if(existent!=null){
            return existent.clone();
        }
        return null;

    }
}
