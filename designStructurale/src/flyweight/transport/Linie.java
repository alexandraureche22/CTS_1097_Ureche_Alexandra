package flyweight.transport;

public class Linie {
    private int numar_linie;
    private String prima_statie;
    private String ultima_statie;

    public Linie(int numar_linie, String prima_statie, String ultima_statie) {
        this.numar_linie = numar_linie;
        this.prima_statie = prima_statie;
        this.ultima_statie = ultima_statie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "numar_linie=" + numar_linie +
                ", prima_statie='" + prima_statie + '\'' +
                ", ultima_statie='" + ultima_statie + '\'' +
                '}';
    }
}
