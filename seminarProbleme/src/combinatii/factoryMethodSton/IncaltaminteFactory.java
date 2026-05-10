package combinatii.factoryMethodSton;

public class IncaltaminteFactory extends ArticolFactory{
    private static IncaltaminteFactory instance;

    private IncaltaminteFactory() {
    }
    public static IncaltaminteFactory getInstance(){
        if(instance == null){
            instance = new IncaltaminteFactory();
        }
        return instance;
    }
    @Override
    public Articol creeaza(Tip tip, String model, double pret) throws Exception {
        switch (tip){
            case TipIncaltaminte.PERFORMANTA : return new Adidasi(model,pret);
            case TipIncaltaminte.TIMP_LIBER : return new Ghete(model,pret);
            default: throw new Exception("invalid");
        }
    }
}
