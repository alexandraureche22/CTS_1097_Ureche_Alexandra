package flyweight.transport;

public class AutobuzLinie {
    private String model;
    private int an;
    private int nr_locuri;

    public AutobuzLinie(String model, int an, int nr_locuri) {
        this.model = model;
        this.an = an;
        this.nr_locuri = nr_locuri;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "model='" + model + '\'' +
                ", an=" + an +
                ", nr_locuri=" + nr_locuri +
                '}';
    }
}
