package combinatii.factoryMethodSton;

public class HaineFactory extends ArticolFactory{
    private static HaineFactory instance;

    private HaineFactory() {
    }
    public static HaineFactory getInstance(){
        if(instance == null){
            instance = new HaineFactory();
        }
        return instance;
    }

    @Override
    public Articol creeaza(Tip tip, String model, double pret) throws Exception {
        switch (tip){
            case TipHaine.PANTALONI : return  new Pantaloni(model,pret);
            case TipHaine.TRICOU : return  new Tricou(model,pret);
            default: throw new Exception("invalid");
        }
    }
}
