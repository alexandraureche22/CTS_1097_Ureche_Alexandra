package decorator.hotel;

public class OfertaSpecialaDecorator extends OfertaDecorator{
    @Override
    public void printareOferta() {
        super.printareOferta();
        System.out.println("Oferta speciala de sarbatori! Reducere 20%!");
    }

    public OfertaSpecialaDecorator(IOferta oferta) {
        super(oferta);
    }
}
