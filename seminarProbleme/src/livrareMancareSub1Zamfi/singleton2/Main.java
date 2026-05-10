package livrareMancareSub1Zamfi.singleton2;

import livrareMancareSub1Zamfi.factory2.CandidatFactory;
import livrareMancareSub1Zamfi.factory2.DosarCandidat;

public class Main {
    public static void main(String[] args) throws Exception {
        RegistruCandidati registruCandidati = RegistruCandidati.getInstance();
        RegistruCandidati registruCandidati1 = RegistruCandidati.getInstance();
        System.out.println("egale?"+(registruCandidati1==registruCandidati));

        DosarCandidat c1 = CandidatFactory.creeaza("olimpic","ureche alexandra",9.70,
                "s123","primiul 1");
        DosarCandidat c2 = CandidatFactory.creeaza("ces","gheorghe mihai",5.70,
                "s123","primiul 5");
        DosarCandidat c3 = CandidatFactory.creeaza("ces","mic lola",7.80,
                "s123","mentiune");
        DosarCandidat c4 = CandidatFactory.creeaza("normal","vasile ion",4.3,
                "s123","primiul 3");

        registruCandidati.adaugaDosar(c1);
        registruCandidati.adaugaDosar(c2);
        registruCandidati1.adaugaDosar(c3);
        registruCandidati.adaugaDosar(c4);
        registruCandidati.afiseazaDosare();
    }
}
