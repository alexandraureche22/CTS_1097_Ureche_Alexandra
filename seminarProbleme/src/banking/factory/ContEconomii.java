package banking.factory;

public class ContEconomii extends Account{
    public ContEconomii(String userId, double soldInitial) {
        super(userId, soldInitial);
    }

    @Override
    public String toString() {
        return "ContEconomii{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}';
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("ContEconomii{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}');
    }
}
