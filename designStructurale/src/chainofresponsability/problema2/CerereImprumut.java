package chainofresponsability.problema2;

public class CerereImprumut {
    private String cod;
    private double suma;

    public CerereImprumut(String cod, double suma) {
        this.cod = cod;
        this.suma = suma;
    }

    public double getSuma() {
        return suma;
    }

    public String getCod() {
        return cod;
    }
}
