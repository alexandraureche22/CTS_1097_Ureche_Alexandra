package hospital.singleton;

public class Serviciu3 implements IHospitalService{
    private static Serviciu3 instance;
    private String id;
    private String descriere;
    private Serviciu3(){}
    public static Serviciu3 getInstance(){
        if(instance ==null){
            instance = new Serviciu3();
        }
        return instance;
    }
    @Override
    public String getServiceId() {
        return id;
    }

    @Override
    public String getServiceDescription() {
        return descriere;
    }

    @Override
    public String toString() {
        return "Serviciu3{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    @Override
    public void startService() {
        System.out.println("Serviciu3{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}');

    }
}
