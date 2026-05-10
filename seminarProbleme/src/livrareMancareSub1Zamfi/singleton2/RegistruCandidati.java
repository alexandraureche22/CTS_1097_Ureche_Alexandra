package livrareMancareSub1Zamfi.singleton2;

import livrareMancareSub1Zamfi.factory2.DosarCandidat;

import java.util.ArrayList;
import java.util.List;

public class RegistruCandidati {
    private static RegistruCandidati instance;
    private List<DosarCandidat> dosare = new ArrayList<>();
    private RegistruCandidati(){}
    public static RegistruCandidati getInstance(){
        if(instance==null){
            instance= new RegistruCandidati();
        }
        return instance;
    }
    public void afiseazaDosare(){
        for(DosarCandidat dosar: dosare){
            System.out.println("Dosare: "+ dosar.getDetalii()+"\n");
        }
    }

    public void adaugaDosar(DosarCandidat d){
        dosare.add(d);
    }
}
