package combinatii2.factoryMethod;

public class StocareFactory extends  ComponentaFactory{
    private static StocareFactory instance;

    private StocareFactory() {
    }
    public static StocareFactory getInstance(){
        if(instance==null){
            instance= new StocareFactory();
        }
        return instance;
    }
    @Override
    public Stocare creeaza(Tip tip, String nume, double pret) throws Exception {
        switch (tip){
            case EStocare.SDD: return new SDD(nume,pret);
            case EStocare.HDD: return new HDD(nume,pret);
            default: throw new Exception("invalid");
        }
    }
}
