package pizzerie.prototype;

import java.util.HashMap;
import java.util.Map;

public class PizzaCollection {
    private Map<String, PizzaPresetata> map=new HashMap<>();
    public void salveazaPizza(String tip, PizzaPresetata pizza){
        if (!map.containsKey(tip)) {
            map.put(tip,pizza);
        }
    }
    public  PizzaPresetata getPizza(String tip) throws CloneNotSupportedException {
        PizzaPresetata p = map.get(tip);
        if(p!=null){
            return p.clone();
        }
       return null;
    }
}
