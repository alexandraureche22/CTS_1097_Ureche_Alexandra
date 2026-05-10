package combinatii.builderSton;

public class Card {
    private boolean areAsigurare;
    private double limitaCredit;
    private String design;
    private boolean areAccesVIP;
    private boolean areCardVirtual;

    public Card(boolean areAsigurare, double limitaCredit, String design, boolean areAccesVIP, boolean areCardVirtual) {
        this.areAsigurare = areAsigurare;
        this.limitaCredit = limitaCredit;
        this.design = design;
        this.areAccesVIP = areAccesVIP;
        this.areCardVirtual = areCardVirtual;
    }

    @Override
    public String toString() {
        return "Card{" +
                "areAsigurare=" + areAsigurare +
                ", limitaCredit=" + limitaCredit +
                ", design='" + design + '\'' +
                ", areAccesVIP=" + areAccesVIP +
                ", areCardVirtual=" + areCardVirtual +
                '}';
    }

}
