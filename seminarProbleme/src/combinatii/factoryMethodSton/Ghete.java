package combinatii.factoryMethodSton;

public class Ghete extends Articol{
    public Ghete(String model, double pret) {
        super(model, pret);
    }
    @Override
    public void afiseaza() {
        System.out.println("Ghete "+getModel()+" | "+getPret());
    }
}
