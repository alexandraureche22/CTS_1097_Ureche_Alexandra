package cinema.builder.main;

import cinema.builder.Bilet;
import cinema.builder.BiletBuilder;

public class Main {
    public static void main(String[] args) {
        Bilet bilet1 = new BiletBuilder("proiecte cinema","titanic").setSala(3)
                .setRand(12).setScaun(21).build();
        Bilet bilet2 = new BiletBuilder("proiecte cinema","megamind").setSala(5)
                .setRand(2).setScaun(14).setIncludePopcorn(true).setIncludeBautura(false).build();
        Bilet bilet3 = new BiletBuilder("proiecte 3d","halloween").setSala(10)
                .setRand(10).setScaun(15).build();
        System.out.println(bilet1);
        System.out.println(bilet2);
        System.out.println(bilet3);


    }
}
