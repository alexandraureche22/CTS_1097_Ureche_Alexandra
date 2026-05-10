package universitate.registry;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<Integer, IModul> map= new HashMap<>();
    private static Registry instance;

    private Registry() {
    }
    public static Registry getInstance(){
        if(instance==null){
            instance = new Registry();
        }
        return instance;
    }
    public IModul getRegistry(int id){
        return map.get(id);
    }
    public void  inregistreaza(int id, IModul modul){
        if(!map.containsKey(id)){
            map.put(id, modul);
        }
        else{
            System.out.println("Modul inregistrat.");
        }
    }
}
