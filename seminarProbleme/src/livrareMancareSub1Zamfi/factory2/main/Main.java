package livrareMancareSub1Zamfi.factory2.main;

import livrareMancareSub1Zamfi.factory2.CandidatFactory;
import livrareMancareSub1Zamfi.factory2.DosarCandidat;

public class Main {
    public static void main(String[] args) throws Exception {
        DosarCandidat c1 = CandidatFactory.creeaza("olimpic","ureche alexandra",9.70,
                "s123","primiul 1");
        DosarCandidat c2 = CandidatFactory.creeaza("ces","gheorghe mihai",5.70,
                "s123","primiul 5");
        DosarCandidat c3 = CandidatFactory.creeaza("ces","mic lola",7.80,
                "s123","mentiune");
        DosarCandidat c4 = CandidatFactory.creeaza("normal","vasile ion",4.3,
                "s123","primiul 3");
        c1.afiseazaNume();
        System.out.println(c1.getDetalii());
        System.out.println(c2.getDetalii());
        System.out.println(c3.getDetalii());
        System.out.println(c4.getDetalii());

    }
}
