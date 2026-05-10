package combinatii.factorySton;

public class Prize extends Dispozitiv {
    public Prize(String model, double pret){
        super(model,pret);
    }
    public Prize(Prize altu){
        super(altu);

    }
    @Override
    public IPrototype cloneaza() {
        return new Prize(this);
    }

    @Override
    public void afiseaza() {
        System.out.println("Prize");
    }

}
