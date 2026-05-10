package hotel.model.factory;

public class CameraFactory {
    public static ICamera creeaza(String tip, String facilitati, double pret, int nrCamera, double suprafata) throws Exception {
        switch (tip){
            case "dubla":return new CameraDubla(facilitati, pret, nrCamera, suprafata);
            case "single":return new CameraSingle(facilitati, pret, nrCamera, suprafata);
            case "apartament":return new Apartament(facilitati, pret, nrCamera, suprafata);
            case "suite":return new Suite(facilitati, pret, nrCamera, suprafata);
            default:throw new Exception("tip invalid");
        }
    }
}
