package command.problema1;

public class Sofer {
    private String nume;

    public Sofer(String nume) {
        this.nume = nume;
    }
    public void livreaza(){
        System.out.println("Soferul "+this.nume+" a efectuat livrarea.");
    }
    public void anuleazaLivrarea(){
        System.out.println("Livrare anulata.");
    }
    public void refaceLivrare(){
        System.out.println("Refacere livrare.");
    }
}
