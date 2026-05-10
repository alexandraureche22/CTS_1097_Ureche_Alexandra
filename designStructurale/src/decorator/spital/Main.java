package decorator.spital;

public class Main {
    static void main() {
        IRezultate rezultateprintate = new RezultatePrintate();
        IRezultate rezultateOnline = new RezultateOnlineDecorator(rezultateprintate);
        rezultateprintate.afiseazaRezultate();
        rezultateOnline.afiseazaRezultate();
        rezultateprintate.afiseazaRezultate();
    }
}
