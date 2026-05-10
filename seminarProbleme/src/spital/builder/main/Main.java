package spital.builder.main;

import spital.builder.Pacient;
import spital.builder.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new PacientBuilder("alex").setArePat(true).setAreMicDejun(true).build();
        Pacient p2 = new PacientBuilder("denis").setArePat(true).setAreMicDejun(true).setAreHalat(true).build();
        System.out.println(p1);
        System.out.println(p2);

    }
}
