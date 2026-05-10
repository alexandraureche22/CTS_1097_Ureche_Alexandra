package rezervareCombinat.factorySingleton;


public class SupaFactorySingleton {
    private static SupaFactorySingleton instance;

    private SupaFactorySingleton() {
    }

    public static SupaFactorySingleton getInstance(){
        if(instance == null){
            instance = new SupaFactorySingleton();
        }
        return instance;
    }
    public Supa getSupa(TipSupa tip, String denumire) throws Exception {
        switch (tip){
            case SUPA_CIUPERCI : return new SupaCiuperci();
            case SUPA_LEGUME: return new SupaLegume();
            case SUPA_VITA: return new SupaVita();
            default: throw new Exception("tip invalid");
        }
    }
}
