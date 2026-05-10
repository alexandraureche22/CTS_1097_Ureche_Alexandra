package produs.resgistry;

import produs.factory.ProdusBio;
import produs.factory.ProdusGeneric;

import java.util.HashMap;
import java.util.Map;

public class ProdusRegistry {
    private static ProdusRegistry instance;
    private Map<String, ProdusGeneric> produse = new HashMap<>();
    private ProdusRegistry(){}
    public static ProdusRegistry getInstance(){
        if(instance==null){
            instance = new ProdusRegistry();
        }
        return instance;
    }
    public void adaugaProdus(String nume, ProdusGeneric p){
        if(!produse.containsKey(nume)){
            produse.put(nume,p);
        }
        else System.out.println("Produsul exista deja");
        ProdusGeneric existent = produse.get(nume);
        existent.setStoc(existent.getStoc()+p.getStoc());

    }
    public ProdusGeneric getProdus(String nume){
        return produse.get(nume);
    }
    public void afiseazaTotalProduse() {
        System.out.println("\n=== PRODUSE ÎN MAGAZIN ===");
        for (ProdusGeneric p : produse.values()) {
            p.afiseazaDetalii();
        }
        System.out.println("Total: " + produse.size() + " produse");
        System.out.println("==========================\n");
    }
}
