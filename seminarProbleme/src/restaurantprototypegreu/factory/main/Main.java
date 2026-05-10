package restaurantprototypegreu.factory.main;

import restaurantprototypegreu.factory.FelFactory;
import restaurantprototypegreu.factory.IFelMancare;

public class Main {
    public static void main(String[] args) throws Exception {
        IFelMancare f1 = FelFactory.creeaza("desert","tiramisu","extra cafea",29.99);
        IFelMancare f2 = FelFactory.creeaza("aperitiv","platou salam","extra branza",119);
        IFelMancare f3 = FelFactory.creeaza("felprincipal","ciorba vacuta","mixt legume bio",12.99);
        f1.preparare();
        System.out.println(f2);
        System.out.println(f3);
    }
}
