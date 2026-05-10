package adapter.transport;

public class TransportTerestru {
    private String nume;

    public TransportTerestru(String nume) {
        this.nume = nume;
    }
    public void cumparaBilet(){
        System.out.println("Bilet cumparat pentru: "+this.nume);
    }
    public void achizitioneazaBilet(){
        this.cumparaBilet();
        System.out.println("Bilet achizitonat cu cumparare.");
    }
}
