package prototype.map;

import pizzerie.prototype.PizzaPresetata;

import java.util.HashMap;
import java.util.Map;

public class RegistruInvitatie {
    private Map<String, InvitatiePresetata> map= new HashMap<>();

    @Override
    public String toString() {
        return "RegistruInvitatie{" +
                "map=" + map +
                '}';
    }
    public void salveazaInvitatie(String tip, InvitatiePresetata invitatie){
        if(map.containsKey(tip)){
            System.out.println("exista deja");
        }
        else map.put(tip, invitatie);

    }
    public InvitatiePresetata getInvitatie(String tip){
        InvitatiePresetata existent = map.get(tip);
        if(existent!=null){
            return (InvitatiePresetata) existent.cloneaza();
        }
        return null;

    }
}
