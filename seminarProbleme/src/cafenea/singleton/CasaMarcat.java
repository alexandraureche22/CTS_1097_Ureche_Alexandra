package cafenea.singleton;

import cafenea.singleton.Bautura;

import java.util.ArrayList;
import java.util.List;

public class CasaMarcat implements ComandaManager{
    private static CasaMarcat instance;
    private List< Bautura> bauturi=new ArrayList<>();
    public static CasaMarcat getInstance(){
        if(instance==null){
            instance = new CasaMarcat();
        }
        return instance;
    }
    private CasaMarcat(){}

    @Override
    public void adaugaBautura(Bautura b) {
        bauturi.add(b);
    }


    @Override
    public void afiseazaComanda() {
        System.out.println("CasaMarcat{" +
                "bauturi=" + bauturi +
                '}');
    }

    @Override
    public double calculeazaPretTotal() {
        double total =0;
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
