package observer.problema2;

public class Main {
    static void main() {
        Sofer sofer1 = new Sofer("deniboss");
        Sofer sofer2 = new Sofer("ale");
        Sofer sofer3 = new Sofer("ana");


        Aplicatie aplicatie = new Aplicatie("aplicatie curierat");
        aplicatie.adaugaNotificare(sofer1);
        aplicatie.adaugaNotificare(sofer2);
        aplicatie.adaugaNotificare(sofer3);
        aplicatie.notifyObserver("coamnda20202");
    }
}
