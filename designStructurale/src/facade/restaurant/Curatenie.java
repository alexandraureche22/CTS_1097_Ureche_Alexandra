package facade.restaurant;

public class Curatenie {
    private boolean esteDebarasata;

    public Curatenie(boolean esteDebarasata) {
        this.esteDebarasata = esteDebarasata;
    }
    public boolean esteMasaDebarasata(){
        if(esteDebarasata){
            System.out.println("Masa este debarasata");
            return true;
        }else{
            System.out.println("Masa nu este debarasata.");
            return false;
        }
    }
}
