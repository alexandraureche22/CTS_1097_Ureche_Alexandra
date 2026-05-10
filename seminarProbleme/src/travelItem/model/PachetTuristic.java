package travelItem.model;


import java.util.Random;

public class PachetTuristic implements TravelItem{
    private double pret;

    private PachetTuristic() {
        Random random = new Random();
        this.pret= random.nextDouble()*20000+30000;
    }

    private static PachetTuristic instance;
    public static PachetTuristic getInstance(){
        if(instance==null){
            instance = new PachetTuristic();
        }
        return instance;
    }
    @Override
    public double getPret() {
        return pret;
    }
}
