package combinatii2.prototype;

public class Card implements ICard {
    private String tipMembru;
    private String numeCititor;
    private String detaliiVerificate;

    public Card(String tipMembru, String numeCititor, String detaliiVerificate) {
        this.tipMembru = tipMembru;
        this.numeCititor = numeCititor;
        this.detaliiVerificate = detaliiVerificate;
    }
    public Card(Card alt) {
        this.tipMembru = alt.tipMembru;
        this.numeCititor = alt.numeCititor;
        this.detaliiVerificate = alt.detaliiVerificate;
    }

    public void setNumeCititor(String numeCititor) {
        this.numeCititor = numeCititor;
    }

    @Override
    public String toString() {
        return "Card{" +
                "tipMembru='" + tipMembru + '\'' +
                ", numeCititor='" + numeCititor + '\'' +
                ", detaliiVerificate='" + detaliiVerificate + '\'' +
                '}';
    }

    @Override
    public Card cloneaza() {
        return new Card(this);
    }
}
