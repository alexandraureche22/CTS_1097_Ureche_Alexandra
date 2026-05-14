package observer.spital;

public class Main {
    static void main() {
        Pacient p1 = new Pacient("deniboss");
        Pacient p2 = new Pacient("deni");
        Pacient p3 = new Pacient("denimicu");

        Spital spital = new Spital("bucuresti");
        spital.addObserver(p1);
        spital.addObserver(p2);
        spital.addObserver(p3);

        spital.notifyObserver("covid");

    }
}
