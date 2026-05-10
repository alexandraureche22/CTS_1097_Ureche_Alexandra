package decorator.spital;

public class RezultateOnlineDecorator extends RezultatDecorator{
    public RezultateOnlineDecorator(IRezultate rezultate) {
        super(rezultate);
    }

    @Override
    public void afiseazaRezultate() {
        super.afiseazaRezultate();
        System.out.println("Rezultatele au fost trimise si online.");
    }
}
