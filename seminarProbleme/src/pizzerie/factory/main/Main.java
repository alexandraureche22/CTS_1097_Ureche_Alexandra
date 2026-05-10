package pizzerie.factory.main;

import pizzerie.factory.Pizza;
import pizzerie.factory.PizzaFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Pizza p1 = PizzaFactory.creeaza("diavola","diavola mexicano super spicy",30,55);
        Pizza p2 = PizzaFactory.creeaza("margherita","margherita cheesy crazy",45,38);
        Pizza p3 = PizzaFactory.creeaza("diavola","pepperoni churizo",30,49);
        System.out.println(p1.getDetalii());
        p1.preparare();
        System.out.println("---------");
        System.out.println(p2.getDetalii());
        p2.preparare();
        System.out.println("---------");
        System.out.println(p3.getDetalii());
        p3.preparare();
        System.out.println("---------");

    }
}
