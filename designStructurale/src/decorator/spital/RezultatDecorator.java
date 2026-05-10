package decorator.spital;

public class RezultatDecorator implements IRezultate{
    private IRezultate rezultate;

    public RezultatDecorator(IRezultate rezultate) {
        this.rezultate = rezultate;
    }

    @Override
    public void afiseazaRezultate() {
        this.rezultate.afiseazaRezultate();
    }
}
