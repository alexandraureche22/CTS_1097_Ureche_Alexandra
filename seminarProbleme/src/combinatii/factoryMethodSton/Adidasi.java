package combinatii.factoryMethodSton;

public class Adidasi extends Articol{
    public Adidasi(String model, double pret){
        super(model,pret);
    }
    @Override
    public void afiseaza() {
        System.out.println("Adidasi "+ getModel()+" | "+getPret());
    }
}
