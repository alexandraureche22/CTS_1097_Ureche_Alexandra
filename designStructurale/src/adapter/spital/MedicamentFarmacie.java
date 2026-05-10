package adapter.spital;

public class MedicamentFarmacie implements IMedicamentFarmacie{

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicament achizitonat,fara verificare reteta.");
    }
}
