package strategy.problema1;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
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
            System.out.println("Nu s a efectuat plata.");
        }
    }
}
