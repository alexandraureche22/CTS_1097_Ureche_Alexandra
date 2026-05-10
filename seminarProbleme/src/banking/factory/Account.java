package banking.factory;

public abstract class Account {
    protected String userId;
    protected double soldInitial;

    public Account(String userId, double soldInitial) {
        this.userId = userId;
        this.soldInitial = soldInitial;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getSoldInitial() {
        return soldInitial;
    }

    public void setSoldInitial(double soldInitial) {
        this.soldInitial = soldInitial;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userId='" + userId + '\'' +
                ", soldInitial=" + soldInitial +
                '}';
    }
    public abstract void afiseazaDetalii();

}
