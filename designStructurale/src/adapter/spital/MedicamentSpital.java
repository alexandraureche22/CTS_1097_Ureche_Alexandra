package adapter.spital;

public class MedicamentSpital {
    private String nume;

    public MedicamentSpital(String nume) {
        this.nume = nume;
    }
    public void prezintaReteta(){
        System.out.println("Reteta medicamentului" + this.nume+"este verificata");
    }
    public void achizitioneazaMedicament() {
        this.prezintaReteta();
        System.out.println("Medicamentul "+this.nume+"este verificat cu reteta.");
    }
}
