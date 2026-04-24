package state;

public class Pacient {
    private String nume;
    private Stari stare;
    Pacient(String nume){
        this.nume=nume;
        this.stare = new Internare();
    }
    public void setStare(Stari stare){
        this.stare =stare;
    }
    public void interneaza(){
        this.stare.interneaza();
    }
    public void subObservatie(){
        this.stare.trecereSubObservatie();
    }
    public void externeaza(){
        this.stare.externeaza();
    }
}
