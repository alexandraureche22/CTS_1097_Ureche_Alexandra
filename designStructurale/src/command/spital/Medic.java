package command.spital;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public void internarePacient(){
        System.out.println("Internare pacient.");
    }
    public void internareImediata(){
        System.out.println("Internare imediata.");
    }
    public void anuleazaInternare(){
        System.out.println("Internare anulata.");
    }

}
