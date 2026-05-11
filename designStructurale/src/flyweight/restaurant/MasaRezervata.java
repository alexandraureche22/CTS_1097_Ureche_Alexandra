package flyweight.restaurant;

public class MasaRezervata {
    private int numar_masa;
    private int numar_persoane;
    private String ora_rezervarii;

    public MasaRezervata(int numar_masa, int numar_persoane, String ora_rezervarii) {
        this.numar_masa = numar_masa;
        this.numar_persoane = numar_persoane;
        this.ora_rezervarii = ora_rezervarii;
    }

    @Override
    public String toString() {
        return "MasaRezervata{" +
                "numar_masa=" + numar_masa +
                ", numar_persoane=" + numar_persoane +
                ", ora_rezervarii='" + ora_rezervarii + '\'' +
                '}';
    }
}
