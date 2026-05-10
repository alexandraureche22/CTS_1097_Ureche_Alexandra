package rezervareCombinat.factorySingleton.main;

import rezervareCombinat.factorySingleton.Supa;
import rezervareCombinat.factorySingleton.SupaFactorySingleton;
import rezervareCombinat.factorySingleton.TipSupa;

public class Main {
    public static void main(String[] args) throws Exception {
        SupaFactorySingleton s = SupaFactorySingleton.getInstance();
        Supa s1 = s.getSupa(TipSupa.SUPA_CIUPERCI,"supa crema");
        Supa s2 = s.getSupa(TipSupa.SUPA_VITA,"vacuta");
        s1.afiseaza();
    }
}
