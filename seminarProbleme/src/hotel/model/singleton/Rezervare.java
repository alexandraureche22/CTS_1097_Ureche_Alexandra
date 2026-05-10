package hotel.model.singleton;

import hotel.model.factory.ICamera;


import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Rezervare implements ISistemRezervari {
    private static Rezervare instance;
    private Map<String,ICamera> map=new HashMap<>();

    private Rezervare() {
    }

    public static Rezervare getInstance(){
        if(instance==null){
            instance=new Rezervare();
        }
        return instance;
    }

    @Override
    public void adaugaRezervare(String codRezervare, ICamera camera) {
        if(map.containsKey(codRezervare)){
            System.out.println("Rezervarea exista deja.");
        }
        else {
            map.put(codRezervare, camera);
        }
    }


    @Override
    public void afiseazaRezervari() {
        System.out.println("Rezervare{" +
                "camere=" + map +
                '}');
    }
}
