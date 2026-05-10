package combinatii.factoryMethodSton;

public class Pantaloni extends Articol{
    public Pantaloni(String model, double pret) {
        super(model, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Pantaloni "+getModel()+" | "+getPret());

    }
}
