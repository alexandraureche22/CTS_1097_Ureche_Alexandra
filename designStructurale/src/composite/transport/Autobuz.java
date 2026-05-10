package composite.transport;

public class Autobuz extends Flota{
    private String producator;
    private String model;
    private int numarLocuri;
    public Autobuz(String producator,String model, int numarLocuri) {
        super(model);
        this.producator=producator;
        this.model=model;
        this.numarLocuri=numarLocuri;
    }

    @Override
    public void afisareIerarhie(String indenare) {
        System.out.println(indenare+"Autobuz{" +
                "producator='" + producator + '\'' +
                ", model='" + model + '\'' +
                ", numarLocuri=" + numarLocuri +
                '}');
    }
}
