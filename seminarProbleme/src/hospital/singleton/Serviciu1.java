package hospital.singleton;

public class Serviciu1 implements IHospitalService{
    private static Serviciu1 instance;
    private String id;
    private String descriere;
    private Serviciu1(){}
    public static Serviciu1 getInstance(){
        if(instance ==null){
            instance = new Serviciu1();
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
        return "Serviciu1{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    @Override
    public void startService() {
        System.out.println("Serviciu1{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}');

    }
}
