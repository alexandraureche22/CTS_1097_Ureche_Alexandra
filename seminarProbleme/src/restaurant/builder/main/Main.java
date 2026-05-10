package restaurant.builder.main;

import restaurant.builder.Client;
import restaurant.builder.ClientBuilder;
import restaurant.builder.IClient;

public class Main {
    public static void main(String[] args) {
        Client c1 = new ClientBuilder().setAreAccesLaGenMuzica(true).setAreAsezareGeam(true).build();
        Client c2 = new ClientBuilder().setAreAccesLaGenMuzica(true).setAreAsezareGeam(true)
                .setAreDecorareMasa(true).build();
        Client c3 = new ClientBuilder().setAreAccesLaGenMuzica(true).setAreAsezareGeam(true)
                .setAreScauneErgonomice(true).build();
        Client c4 = new ClientBuilder().setAreAccesLaGenMuzica(true).setAreAsezareGeam(true)
                .setAreDecorareMasa(true).setAreMuzicaAmbientala(true).setAreScauneErgonomice(true).build();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
