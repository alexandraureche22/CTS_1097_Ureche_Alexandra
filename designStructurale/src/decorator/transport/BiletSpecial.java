package decorator.transport;

public abstract class BiletSpecial implements IBilet{
    private IBilet bilet;

    public BiletSpecial(IBilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void afiseazaDetalii() {
        this.bilet.afiseazaDetalii();
    }
}
