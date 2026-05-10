package cafenea.singleton;

import java.util.ArrayList;
import java.util.List;

public class BauturaSingleton implements ComandaManager{
    private List<Bautura> bauturi = new ArrayList<>();
    private static BauturaSingleton instance;
    private BauturaSingleton(){

    };
    public static BauturaSingleton getInstance(){
        if(instance==null){
            instance = new BauturaSingleton();
        }
        return instance;
    }
    @Override
    public void adaugaBautura(Bautura b) {
        bauturi.add(b);
    }

    @Override
    public void afiseazaComanda() {
        System.out.println("BauturaSingleton{" +
                "bauturi=" + bauturi +
                '}');
    }

    @Override
    public double calculeazaPretTotal() {
        double total = 0;
        for(Bautura b: bauturi){
            total+=b.getPret();
        }
        return total;
    }

    @Override
    public void resetComanda() {
        bauturi.clear();

    }
}
