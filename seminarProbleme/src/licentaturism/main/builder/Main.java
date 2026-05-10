package licentaturism.main.builder;

import licentaturism.model.builder.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PachetTuristic p1 = new PachetTuristicBuilder().setTransport(new Transport("avion"))
                .setCazare(new Cazare(3,"dubla",5)).setActivitatiExtra(
                        new ActivitatiExtra(List.of("cetatuia","iasi"),List.of("peles","bran"))
                ).build();
        PachetTuristic p2 = new PachetTuristicBuilder().setTransport(new Transport("avion"))
                .setCazare(new Cazare(3,"dubla",5)).build();
        System.out.println(p1);
        System.out.println(p2);
    }
}
