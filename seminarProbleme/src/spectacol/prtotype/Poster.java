package spectacol.prtotype;

import spectacol.factory.IShow;

public class Poster implements IPoster, PosterCloneaza{
    private String tip;
    private String logo;
    private IShow show;

    public Poster(String tip, String logo) {
        this.tip = tip;
        this.logo = logo;

    }
    public Poster(Poster altul) {
        this.tip = altul.tip;
        this.logo = altul.logo;
        this.show=altul.show;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "tip='" + tip + '\'' +
                ", logo='" + logo + '\'' +
                ", show=" + show +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Poster{" +
                "tip='" + tip + '\'' +
                ", logo='" + logo + '\'' +
                ", show=" + show +
                '}');

    }

    public void setShow(IShow show) {
        this.show = show;
    }

    @Override
    public PosterCloneaza cloneaza() {
        return new Poster(this);
    }
}
