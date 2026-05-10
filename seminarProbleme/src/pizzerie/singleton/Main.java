package pizzerie.singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Comanda comanda=Comanda.getInstance();
        Comanda comanda1 = Comanda.getInstance();
        System.out.println("egale?"+(comanda1==comanda));
        Pizza p1 = PizzaFactory.creeaza("diavola","spicy",30,39);
        Pizza p2 = PizzaFactory.creeaza("margherita","cheesy",50,55);
        comanda.adaugaPizza(p2);
        comanda.adaugaPizza(p1);
        comanda.afiseazaComanda();
        System.out.println(comanda.calculeazaPretTotal());
        comanda.resetComanda();
        Pizza p3 = PizzaFactory.creeaza("pepperoni","chorizoooo",50,55);
        comanda.adaugaPizza(p3);
        comanda.afiseazaComanda();
    }
}
