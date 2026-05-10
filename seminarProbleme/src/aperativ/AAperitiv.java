package aperativ;

public abstract class AAperitiv {
    protected String nume;
    protected String ingrediente;

    public AAperitiv(String nume, String ingrediente) {
        this.nume = nume;
        this.ingrediente = ingrediente;
    }

    public String getNume() {
        return nume;
    }
    public abstract void serveste();

    public String getIngrediente() {
        return ingrediente;
    }

    @Override
    public String toString() {
        return "AAperitiv{" +
                "nume='" + nume + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                '}';
    }
}
