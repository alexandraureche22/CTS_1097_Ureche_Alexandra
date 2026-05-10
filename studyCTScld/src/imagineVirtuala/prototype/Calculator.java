package imagineVirtuala.prototype;

public class Calculator implements Cloneable{
    private String model;
    private double pret;

    public Calculator(String model, double pret) {
        this.model = model;
        this.pret = pret;
    }

    public String getModel() {
        return model;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "model='" + model + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
