package transport.factory;

public class MijlocFactory {
    public static IMijloc creeaza(MijlocTRansport tip, String numar, int nrLocuri) throws Exception {
        switch (tip){
            case AUTOBUZ : return new Autobuz(numar,nrLocuri);
            case TRAMVAI : return new Tramvai(numar,nrLocuri);
            case TROLEIBUS: return new Troleibus(numar,nrLocuri);
            default: throw new Exception("tip invalid");
        }
    }
}
