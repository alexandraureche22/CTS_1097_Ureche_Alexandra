package combinatii.builderSton;
public class CardBuilder implements ICard {
    private boolean areAsigurare;
    private double limitaCredit;
    private String design;
    private boolean areAccesVIP;
    private boolean areCardVirtual;
    private CardBuilder (){ reset();}

    private void reset() {
        this.areAsigurare = false;
        this.limitaCredit =0;
        this.design="necunoscut";
        this.areAccesVIP = false;
        this.areCardVirtual = false;
    }

    public static CardBuilder instance;

    public static synchronized CardBuilder getInstance(){
        if(instance == null)
        {
            instance = new CardBuilder();
        }
        return instance;
    }

    public CardBuilder setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
        return this;
    }

    public CardBuilder setLimitaCredit(double limitaCredit) {
        this.limitaCredit = limitaCredit;
        return this;
    }

    public CardBuilder setDesign(String design) {
        this.design = design;
        return this;
    }

    public CardBuilder setAreAccesVIP(boolean areAccesVIP) {
        this.areAccesVIP = areAccesVIP;
        return this;
    }

    public CardBuilder setAreCardVirtual(boolean areCardVirtual) {
        this.areCardVirtual = areCardVirtual;
        return this;
    }

    @Override
    public Card build() {
        return new Card(areAsigurare,limitaCredit,design,areAccesVIP,areCardVirtual);
    }
}
