package licentaturism.model.singleton;

public class TourismLicense implements AbstractTourismLicense{
    private static TourismLicense instance;
    private boolean isSet;
    private TourismLicense(){}
    public static synchronized TourismLicense getInstance(){
     if(instance==null){
         instance=new TourismLicense();
     }
     return instance;
    }

    @Override
    public void setLicenseNumber() {
        if(isSet){
            throw new TourismLicenseException("licenta este deja setata");
        }
        isSet=true;
    }
}
