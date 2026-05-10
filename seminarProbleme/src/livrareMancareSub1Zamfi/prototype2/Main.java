package livrareMancareSub1Zamfi.prototype2;

import livrareMancareSub1Zamfi.factory2.CandidatFactory;
import livrareMancareSub1Zamfi.factory2.DosarCandidat;

public class Main {
    public static void main(String[] args) throws Exception {
        Certificat premiul1 = new Certificat("sigiuliu premium","logo.png");
        Certificat premiul2 = new Certificat("miau miau","logo.png");
        Certificat premiul3 = new Certificat("premium","logo.png");

        DosarCandidat c1 = CandidatFactory.creeaza("olimpic","ureche alexandra",9.70,
                "s123","primiul 1");
        DosarCandidat c2 = CandidatFactory.creeaza("ces","gheorghe mihai",5.70,
                "s123","primiul 5");
        DosarCandidat c3 = CandidatFactory.creeaza("ces","mic lola",7.80,
                "s123","mentiune");
        DosarCandidat c4 = CandidatFactory.creeaza("normal","vasile ion",4.3,
                "s123","primiul 3");

        Certificat crt1 = (Certificat) premiul1.clone();
        Certificat crt2 = (Certificat) premiul2.clone();
        Certificat crt3 = (Certificat) premiul3.clone();
        System.out.println("egale?"+(crt1==premiul1));
        crt1.setDosar(c2);
        crt2.setDosar(c1);
        crt3.setDosar(c3);
        crt1.print();
        crt2.print();
        crt3.print();
    }
}
