package pizzerie.singleton;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements ComandaManager{
    private List<Pizza> pizze = new ArrayList<>();
    private static Comanda instance;
    private Comanda(){}
    public static Comanda getInstance(){
        if(instance==null){
            instance=new Comanda();
        }
        return instance;
    }
    @Override
    public void adaugaPizza(Pizza p) {
        pizze.add(p);

    }

    @Override
    public String toString() {
        return "Comanda{" +
                "pizze=" + pizze +
                '}';
    }

    @Override
    public void afiseazaComanda() {
        System.out.println("Comanda{" +
                "pizze=" + pizze +
                '}');

    }

    @Override
    public double calculeazaPretTotal() {
        double total =0;
        for(Pizza p:pizze){
            total+=p.getPret();
        }
        return total;
    }

    @Override
    public void resetComanda() {
        pizze.clear();

    }
}
