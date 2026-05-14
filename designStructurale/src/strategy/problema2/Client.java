package strategy.problema2;

public class Client {
   private String nume;
   private IReducere iReducere;

    public Client(String nume) {
        this.nume = nume;
    }

    public void setiReducere(IReducere iReducere) {
        this.iReducere = iReducere;
    }
    public void reducere(){
        if(iReducere!=null){
            iReducere.reducere();
        }
        else{
            System.out.println("Nu s a ales nicio reducere.");
        }
    }
}
