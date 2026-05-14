package observer.transport;

public class Main {
    static void main() {
        Autobuz autobuz = new Autobuz("crangasi");
        Calator c1 = new Calator("deni");
        Calator c2 = new Calator("deniboss");
        Calator c3 = new Calator("denimicu");
        autobuz.adaugaObserver(c1);
        autobuz.adaugaObserver(c2);
        autobuz.adaugaObserver(c3);
        autobuz.pleacaDinStatie("dristor");
    }
}
