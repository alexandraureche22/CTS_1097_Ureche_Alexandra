package iar.factoryMethod;

import iar.factoryMethod.PersonalSpital;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonalNonMedical personalNonMedical = PersonalNonMedical.getInstance();
        PersonalMedical personalMedical = PersonalMedical.getInstance();

        PersonalSpital p1 = personalMedical.creeazaMedical(Medical.MEDIC,"ureche alexandra",9);
        PersonalSpital p2 = personalMedical.creeazaMedical(Medical.ASISTENT,"sescu denis",2);
        PersonalSpital p3 = personalNonMedical.creeazaMedical(NonMedical.SECRETAR,"vasile ana",2);
        p1.afiseazaOcupatia();
        p2.afiseazaOcupatia();
        p3.afiseazaOcupatia();

    }
}
