package cafenea.prototype;

import java.util.HashMap;
import java.util.Map;

public class Collection {
    private Map<String, BauturaPresetata> map= new HashMap<>();
    public void salveazaBauturi(String nume, BauturaPresetata bautura){
        if(!map.containsKey(nume)){
            map.put(nume,bautura);
        }
    }
    public BauturaPresetata getBautura(String nume) throws CloneNotSupportedException {
        BauturaPresetata bp = map.get(nume);
        if(bp!=null){
            return bp.clone();
        }
        return null;
    }
}
