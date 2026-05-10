package hospital.singleton;

import java.util.HashMap;
import java.util.Map;

public class ServiciuRegistry {
    private static ServiciuRegistry instance;
    private Map<String, IHospitalService> map=new HashMap<>();
    private  ServiciuRegistry(){}
    public static ServiciuRegistry getInstance(){
        if(instance==null){
            instance = new ServiciuRegistry();
        }
        return instance;
    }
    public void inregistreazaServiciu(String nume, IHospitalService serviciu){
        map.put(nume,serviciu);
    }
    public IHospitalService getServiciu(String nume){
       return map.get(nume);

    }

}
