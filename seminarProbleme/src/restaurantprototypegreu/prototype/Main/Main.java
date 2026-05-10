package restaurantprototypegreu.prototype.Main;

import restaurantprototypegreu.factory.FelFactory;
import restaurantprototypegreu.factory.IFelMancare;
import restaurantprototypegreu.prototype.MeniuPresetat;

public class Main {
    public static void main(String[] args) throws Exception {
        MeniuPresetat meniu1 = new MeniuPresetat("meniu vegetarian");
        MeniuPresetat meniu2 = new MeniuPresetat("meniu italian");
        MeniuPresetat meniu3 = new MeniuPresetat("meniu chinezesc");
        IFelMancare f1 = FelFactory.creeaza("desert","tiramisu","extra cafea",29.99);
        IFelMancare f2 = FelFactory.creeaza("aperitiv","platou salam","extra branza",119);
        IFelMancare f3 = FelFactory.creeaza("felprincipal","ciorba vacuta","mixt legume bio",12.99);

        MeniuPresetat m1 = (MeniuPresetat) meniu1.cloneaza();
        MeniuPresetat m2 = (MeniuPresetat) meniu2.cloneaza();
        MeniuPresetat m3 = (MeniuPresetat) meniu3.cloneaza();
        m1.setFel(f1);
        m2.setFel(f2);
        m3.setFel(f3);

        m1.print();
        m2.print();
        m3.print();
        System.out.println("egale?"+(m1==meniu1));
    }
}
