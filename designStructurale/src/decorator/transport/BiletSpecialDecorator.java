package decorator.transport;

public class BiletSpecialDecorator extends BiletSpecial{
    public BiletSpecialDecorator(IBilet bilet) {
        super(bilet);
    }

    @Override
    public void afiseazaDetalii() {
        super.afiseazaDetalii();
        System.out.println("La multi ani!");
    }
}
