import adapter.spital.IMedicamentFarmacie;
import adapter.spital.MedicamentAdapter;
import adapter.spital.MedicamentFarmacie;
import adapter.spital.MedicamentSpital;

void main() {
    MedicamentSpital medicamentSpital = new MedicamentSpital("propofol");
    IMedicamentFarmacie iMedicamentFarmacie  = new MedicamentFarmacie();
    IMedicamentFarmacie iMedicamentFarmacie1 = new MedicamentAdapter(medicamentSpital);
    List<IMedicamentFarmacie> medicamente = List.of(iMedicamentFarmacie,iMedicamentFarmacie1);
    medicamente.forEach(IMedicamentFarmacie::cumparaMedicament);

}
