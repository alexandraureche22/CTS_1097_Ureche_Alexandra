package spital.factory.main;

import spital.factory.IPersonal;
import spital.factory.PersonalFactory;
import spital.factory.TipPersonal;

public class Main {
    public static void main(String[] args) throws Exception {
        IPersonal p1 = PersonalFactory.creeaza(TipPersonal.Asistent,"ureche",5);
        IPersonal p2 = PersonalFactory.creeaza(TipPersonal.Asistent,"alexandra",10);
        IPersonal p3 = PersonalFactory.creeaza(TipPersonal.Brancardier,"nicholas",1);
        IPersonal p4 = PersonalFactory.creeaza(TipPersonal.Medic,"denis",13);
        p1.afiseazaDetalii();
        p2.afiseazaDetalii();
        p3.afiseazaDetalii();
        p4.afiseazaDetalii();
    }
}
