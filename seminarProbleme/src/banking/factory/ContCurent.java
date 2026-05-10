package banking.factory;

public class ContCurent extends Account{
    public ContCurent(String userId, double soldInitial) {
        super(userId, soldInitial);
    }

    @Override
    public String toString() {
        return "ContCurent{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}';
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("ContCurent{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}');
    }
}
