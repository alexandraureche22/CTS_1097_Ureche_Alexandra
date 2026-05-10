package service.model.singleton;

public class Service implements IService{
    private AMasina masinaCurenta;
    private static Service instance;
    private Service(){}
    public static Service getInstance(){
        if(instance==null){
            instance = new Service();
        }
        return instance;
    }
    @Override
    public void intrareMasina(AMasina masina) {
        if(masinaCurenta==null){
            masinaCurenta=masina;
            System.out.println("Masina a intrat in service");
        }
        else System.out.println("Service ul este ocupat");

    }

    @Override
    public void iesireMasina() {
        if(masinaCurenta!=null){
            System.out.println("Service ocupat.");
            masinaCurenta=null;
        }
        else System.out.println("Service ul este liber");

    }

    @Override
    public AMasina getMasina() {
        return masinaCurenta;
    }
}
