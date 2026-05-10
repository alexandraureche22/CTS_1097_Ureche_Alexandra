package rezervareCombinat.factoryMethodSingleton;

public class DesertFactory extends MancareFactory{
    private static DesertFactory instance;
    private DesertFactory(){

    }
    public static DesertFactory getInstance(){
        if(instance == null){
            instance = new DesertFactory();
        }
        return instance;
    }

    @Override
    public FelDeMancare creeaza(TipMancare tip, String denumire) throws Exception {
        return switch (tip){
            case TipDesert.CHEESECAKE ->  new Cheesecake(denumire);
            case TipDesert.CLATITE->  new Clatite(denumire);
            case TipDesert.PAPANASI->  new Papanasi(denumire);
            default-> throw new Exception("tip invalid");
        };
    }
}
