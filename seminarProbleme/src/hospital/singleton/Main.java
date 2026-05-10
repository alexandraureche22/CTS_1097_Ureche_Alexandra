package hospital.singleton;

public class Main {
    public static void main(String[] args) {
        ServiciuRegistry serviciuRegistry = ServiciuRegistry.getInstance();
        Serviciu1 s1 = Serviciu1.getInstance();
        Serviciu2 s2 = Serviciu2.getInstance();
        Serviciu3 s3 = Serviciu3.getInstance();
        serviciuRegistry.inregistreazaServiciu("cardiologie",s1);
        serviciuRegistry.inregistreazaServiciu("pneumologie",s2);
        serviciuRegistry.inregistreazaServiciu("neurologie",s3);
        s1.startService();
        s2.startService();
        s3.startService();
    }
}
