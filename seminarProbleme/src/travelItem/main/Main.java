package travelItem.main;

import travelItem.model.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = PachetTuristic.getInstance();
        System.out.println(pachetTuristic.getPret());
    }
}
