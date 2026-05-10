package livrareMancareSub1Zamfi.singleton;

import livrareMancareSub1Zamfi.factory.NotificareLivrare;
import livrareMancareSub1Zamfi.factory.NotificareSistem;

import java.util.ArrayList;
import java.util.List;

public class RegistruNotificari {
    private static RegistruNotificari instance;
    private List<NotificareSistem> notificari=new ArrayList<>();
    private RegistruNotificari(){}
    public static RegistruNotificari getInstance(){
        if(instance==null){
            instance=new RegistruNotificari();
        }
        return instance;
    }
    public void adaugaNotificare(NotificareSistem notificare){
        notificari.add(notificare);
    }
    public void afiseaza(){
        for(NotificareSistem n:notificari){
            System.out.println("Notificare "+n.getMesaj()+" | "+n.getOraTransmitere()+"\n");
        }
        System.out.println("Total notificari: "+notificari.size());
    }
}
