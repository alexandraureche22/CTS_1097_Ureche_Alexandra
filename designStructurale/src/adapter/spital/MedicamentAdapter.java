package adapter.spital;

public class MedicamentAdapter implements IMedicamentFarmacie {
    private MedicamentSpital medicamentSpital;

    public MedicamentAdapter(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Achizitia se face prin intermediul farmaciei.");
        this.medicamentSpital.achizitioneazaMedicament();
    }
}
