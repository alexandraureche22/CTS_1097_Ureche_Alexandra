package spectacol.factory;

import java.util.List;

public class Concert  extends AShow{
    private String genMuzical;
    private List<String> artisti;
    public Concert(String nume, String locatie, String data, String genMuzical, List<String>artisti) {
        super(nume, locatie, data);
        this.genMuzical=genMuzical;
        this.artisti=artisti;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "genMuzical='" + genMuzical + '\'' +
                ", artisti=" + artisti +
                '}'+super.toString();
    }

    public String getGenMuzical() {
        return genMuzical;
    }

    public void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    public List<String> getArtisti() {
        return artisti;
    }

    public void setArtisti(List<String> artisti) {
        this.artisti = artisti;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println( "Concert{" +
                "genMuzical='" + genMuzical + '\'' +
                ", artisti=" + artisti +
                '}'+super.toString());
    }
}
