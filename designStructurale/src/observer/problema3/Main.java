package observer.problema3;

public class Main {
    static void main() {
        Candidat c1 = new Candidat("ale");
        Candidat c2 = new Candidat("deni");
        Candidat c3 = new Candidat("ana");

        Aplicatie a1 = new Aplicatie("job");
        a1.adaugaObserver(c1);
        a1.adaugaObserver(c2);
        a1.adaugaObserver(c3);
        a1.notifyObserver("loc hr");
    }
}
