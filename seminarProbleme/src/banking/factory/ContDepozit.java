package banking.factory;

public class ContDepozit extends Account{
    public ContDepozit(String userId, double soldInitial) {
        super(userId, soldInitial);
    }

    @Override
    public String toString() {
        return "ContDepozit{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}';
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("ContDepozit{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}');
    }
}
