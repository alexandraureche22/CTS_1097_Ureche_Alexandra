package hospital.singleton;

public class Serviciu2 implements IHospitalService{
    private static Serviciu2 instance;
    private String id;
    private String descriere;
    private Serviciu2(){}
    public static Serviciu2 getInstance(){
        if(instance ==null){
            instance = new Serviciu2();
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
        return "Serviciu2{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }

    @Override
    public void startService() {
        System.out.println("Serviciu2{" +
                "id='" + id + '\'' +
                ", descriere='" + descriere + '\'' +
                '}');

    }
}
