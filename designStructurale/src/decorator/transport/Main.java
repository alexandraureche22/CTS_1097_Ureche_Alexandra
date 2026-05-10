package decorator.transport;

public class Main {
    static void main() {
        IBilet bilet = new BiletPrintat();
        IBilet bilet2 = new BiletSpecialDecorator(bilet);
        bilet.afiseazaDetalii();
        bilet2.afiseazaDetalii();

    }
}
