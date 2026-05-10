package proxy.transport;

public class Main {
    static void main() {
        IAutobuz autobuz = new Autobuz();
        AutobuzNoapteProxy autobuzNoapte = new AutobuzNoapteProxy(autobuz, 5);

        System.out.println("=== Cu calatori ===");
        autobuzNoapte.opresteInStatie("Piata Unirii");
        autobuzNoapte.opresteInStatie("Gara de Nord");

        autobuzNoapte.setNrCalatori(0);
        autobuzNoapte.opresteInStatie("Piata Victoriei");
        autobuzNoapte.opresteInStatie("Baneasa");

        autobuz.opresteInStatie("Piata Unirii");
    }
}
