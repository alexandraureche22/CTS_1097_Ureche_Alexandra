package strategy.spital;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void plateste(){
        if(modPlata!=null){
            modPlata.plateste();
        }
        else{
            System.out.println("nu s a ales modul de plata.");
        }
    }
}
