package licentaturism.model.builder;

public class Transport {
    private String tip;

    public Transport(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "tip='" + tip + '\'' +
                '}';
    }
}
