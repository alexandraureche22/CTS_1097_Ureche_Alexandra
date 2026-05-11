package facade.restaurant;

public class Masa {
    private boolean esteLibera;

    public Masa(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }
    public boolean verificaDacaMasaEsteLibera(){
        if(esteLibera){
            System.out.println("Masa este libera.");
            return true;
        }
        else{
            System.out.println("Masa nu este disponibila.");
            return false;
        }
    }
}
