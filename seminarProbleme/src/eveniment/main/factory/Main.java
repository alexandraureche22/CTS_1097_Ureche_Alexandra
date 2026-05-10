package eveniment.main.factory;

import eveniment.model.factory.*;

public class Main {
    public static void main(String[] args) {
        PachetMethod p1 = new BotezFactory();
        PachetMethod p2 = new CorporateFactory();
        PachetMethod p3 = new NuntaFactory();

        PachetServicii pa1 = p1.creeaza();
        PachetServicii pa2 = p2.creeaza();
        PachetServicii pa3 = p3.creeaza();
        System.out.println(pa1);
        System.out.println(pa2);
        System.out.println(pa3);
    }
}
