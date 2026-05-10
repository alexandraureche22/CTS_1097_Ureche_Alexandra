package aperativ;

public abstract class ADesert {
    protected String nume;
    protected String ingrediente;
    protected int calorii;

    public ADesert(String nume, String ingrediente, int calorii) {
        this.nume = nume;
        this.ingrediente = ingrediente;
        this.calorii = calorii;
    }
    public abstract void serveste();

    @Override
    public String toString() {
        return "ADesert{" +
                "nume='" + nume + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", calorii=" + calorii +
                '}';
    }
}
