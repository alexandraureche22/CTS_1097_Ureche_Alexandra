package facade.hotel;

public class Preturi {
    private boolean esteInBuget;

    public Preturi(boolean esteInBuget) {
        this.esteInBuget = esteInBuget;
    }
    public boolean isEsteInBuget(){
        if(esteInBuget){
            System.out.println("Se incadreaza in buget");
            return true;
        }
        else{
            System.out.println("Nu este in buget");
            return false;
        }
    }
}
