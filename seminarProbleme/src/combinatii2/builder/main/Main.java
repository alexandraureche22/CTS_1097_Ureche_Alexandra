package combinatii2.builder.main;

import combinatii2.builder.BiletAvion;
import combinatii2.builder.BiletBuilder;

public class Main {
    public static void main(String[] args) {
        BiletBuilder instance = BiletBuilder.getInstance();
        BiletAvion b1 = instance.setAreAsigurare(true).setAreBagaj(true).build();
        BiletAvion b2 = instance.setAreAsigurare(true).setAreBagaj(true).setArePrioritate(true).build();
        System.out.println(b1);
        System.out.println(b2);
    }
}
