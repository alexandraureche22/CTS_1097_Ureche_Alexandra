package rezervareCombinat.factoryMethodSingleton;


public class SupaFactory extends MancareFactory{
    private static SupaFactory instance;
    private SupaFactory(){

    }
    public static SupaFactory getInstance(){
        if(instance == null){
            instance = new SupaFactory();
        }
        return instance;
    }

    @Override
    public FelDeMancare creeaza(TipMancare tip, String denumire) throws Exception {
        return switch (tip){
            case TipSupa.VITA ->  new SupaVita(denumire);
            case TipSupa.LEGUME->  new SupaLegume(denumire);
            case TipSupa.CIUPERCI-> new SupaCiuperci(denumire);
            default-> throw new Exception("tip invalid");
        };
    }
}
