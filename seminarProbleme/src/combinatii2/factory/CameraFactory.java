package combinatii2.factory;

public class CameraFactory {
   public static Camera creeaza(TipCamera tip, int nrPersoane, double pret) throws Exception {
        switch (tip){
            case STANDARD : return new Standard(nrPersoane,pret);
            case APARTAMENT:return new Apartament(nrPersoane,pret);
            default: throw new Exception("invalid");
        }
    }
}
