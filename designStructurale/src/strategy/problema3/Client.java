package strategy.problema3;

public class Client {
    private String nume;
    private Tip tip;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }
    public void rezerva(){
        if(tip!=null){
            tip.rezerva();
        }
        else{
            System.out.println("Nu s a ales modul de rezervare.");
        }
    }
}
