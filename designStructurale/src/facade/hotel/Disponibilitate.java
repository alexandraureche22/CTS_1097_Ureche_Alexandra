package facade.hotel;

public class Disponibilitate {
    private boolean esteDisponibil;

    public Disponibilitate(boolean esteDisponibil) {
        this.esteDisponibil = esteDisponibil;
    }
    public boolean verificaDisponibilitate(){
        if(esteDisponibil) {
            System.out.println("Sistemul este disponibil");
            return true;
        }
        else{
            System.out.println("Sistemul nu este disponibil.");
            return false;
        }
    }
}
