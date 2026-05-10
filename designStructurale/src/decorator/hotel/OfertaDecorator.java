package decorator.hotel;

public abstract class OfertaDecorator implements IOferta{
    private IOferta oferta;

    public OfertaDecorator(IOferta oferta) {
        this.oferta = oferta;
    }

    @Override
    public void printareOferta() {
        this.oferta.printareOferta();

    }
}
