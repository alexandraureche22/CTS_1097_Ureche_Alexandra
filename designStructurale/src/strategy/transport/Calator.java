package strategy.transport;

public class Calator {
    private String nume;
    private ModPlata modPlata;

    public Calator(String nume) {
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void plateste(){
        if(modPlata!=null){
            modPlata.plateste();
        }
        System.out.println("nu s a ales mod de plata.");
    }
}
