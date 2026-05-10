package combinatii.factoryMethodSton;

public class Tricou extends Articol{
    public Tricou(String model, double pret) {
        super(model, pret);
    }

    @Override
    public void afiseaza() {
        System.out.println("Tricou: "+getModel()+" | "+getPret());
    }
}
