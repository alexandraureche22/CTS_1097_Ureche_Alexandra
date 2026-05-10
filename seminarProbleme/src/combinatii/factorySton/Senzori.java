package combinatii.factorySton;

public class Senzori extends Dispozitiv {
    public Senzori(String model, double pret){
        super(model,pret);
    }
    @Override
    public IPrototype cloneaza() {
        return new Senzori(this);
    }
    public Senzori(Senzori altu){
        super(altu);
    }

    @Override
    public void afiseaza() {
        System.out.println("Senzori");
    }
}
