package sticker;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;

    public Masina(String model, int anFabricatie) {
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getAnFabricatie() {
        return anFabricatie;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
