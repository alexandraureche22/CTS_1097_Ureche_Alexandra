package sticker;

public class Sticker implements Cloneable{
    private String model;
    private int anFabricatie;
    private double latime;
    private double lungime;

    public Sticker(Masina masina) {
        this.model = masina.getModel();
        this.anFabricatie = masina.getAnFabricatie();
        this.latime = Math.random()*2;
        this.lungime = Math.random()*3;
    }
    public Sticker (Sticker altSticker){
        this.model = altSticker.model;
        this.anFabricatie= altSticker.anFabricatie;
        this.lungime= altSticker.lungime;
        this.latime= altSticker.latime;
    }

    @Override
    protected Sticker clone() throws CloneNotSupportedException {
        return new Sticker(this);
    }
}
