package rezervareCombinat.builderSingleton.main;

import rezervareCombinat.builderSingleton.Rezervare;
import rezervareCombinat.builderSingleton.RezervareBuilderSingleton;

public class Main {
    public static void main(String[] args) {
        RezervareBuilderSingleton r1 = RezervareBuilderSingleton.getInstance();
        RezervareBuilderSingleton r2 = RezervareBuilderSingleton.getInstance();
        System.out.println("sunt egale?"+(r1==r2));

        Rezervare rez1 = r1.setAreAsezareGeam(true).setAreDecorareMasa(true).build();
        Rezervare rez2 = r1.setAreAsezareGeam(true).setAreAccesLaGenMuzica(true).setAreMuzicaAmbientala(true)
                .build();
        System.out.println(rez1);
        System.out.println(rez2);
    }


}
