package licentaturism.model.builder;

public class Cazare {
    private int durataZile;
    private String tipCamera;
    private int stele;

    public Cazare(int durataZile, String tipCamera, int stele) {
        this.durataZile = durataZile;
        this.tipCamera = tipCamera;
        this.stele = stele;
    }

    @Override
    public String toString() {
        return "Cazare{" +
                "durataZile=" + durataZile +
                ", tipCamera='" + tipCamera + '\'' +
                ", stele=" + stele +
                '}';
    }
}
