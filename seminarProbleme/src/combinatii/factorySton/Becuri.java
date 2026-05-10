package combinatii.factorySton;

public class Becuri extends Dispozitiv {
    public Becuri(String model, double pret){
        super(model,pret);
    }
    public Becuri(Becuri altu){
        super(altu);
    }
    @Override
    public IPrototype cloneaza() {
        return new Becuri(this);
    }

    @Override
    public void afiseaza() {
        System.out.println("Bec");
    }
}
