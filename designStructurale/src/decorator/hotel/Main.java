package decorator.hotel;

public class Main {
    static void main() {
        IOferta oferta = new Oferta();
        oferta.printareOferta();
        IOferta oferta1 = new OfertaSpecialaDecorator(oferta);
        oferta1.printareOferta();
    }
}
