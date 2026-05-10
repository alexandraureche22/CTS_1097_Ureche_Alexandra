package spital.factoryMethod.main;

import spital.factoryMethod.AbstractPersonalFactory;
import spital.factoryMethod.IPersonal;
import spital.factoryMethod.PersonalFactoryMedical;
import spital.factoryMethod.PersonalFactoryNonMedical;

public class Main {
    public static void main(String[] args) throws Exception {
        AbstractPersonalFactory abstractPersonalFactoryNoN = new PersonalFactoryNonMedical();
        AbstractPersonalFactory abstractPersonalFactoryMedicala = new PersonalFactoryMedical();
        IPersonal p1 = abstractPersonalFactoryMedicala.creeaza("Medic","alexandra",4);
        IPersonal p2 = abstractPersonalFactoryMedicala.creeaza("Asistent","ana",4);
        IPersonal p3 = abstractPersonalFactoryMedicala.creeaza("Brancardier","delia",4);
        IPersonal p4 = abstractPersonalFactoryNoN.creeaza("Secretar","denis",4);
       p1.afiseazaDetalii();
       p2.afiseazaDetalii();
       p3.afiseazaDetalii();
       p4.afiseazaDetalii();

    }
}
