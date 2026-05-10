package spectacol.factory;

import java.util.List;

public class Teatru extends AShow{
    private String regizor;
    private List<String> actori;
    public Teatru(String nume, String locatie, String data, String regizor, List<String>actori) {
        super(nume, locatie, data);
        this.regizor=regizor;
        this.actori=actori;
    }

    @Override
    public String toString() {
        return "Teatru{" +
                "regizor='" + regizor + '\'' +
                ", actori=" + actori +
                '}'+super.toString();
    }

    public String getRegizor() {
        return regizor;
    }

    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    public List<String> getActori() {
        return actori;
    }

    public void setActori(List<String> actori) {
        this.actori = actori;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println( "Teatru{" +
                "regizor='" + regizor + '\'' +
                ", actori=" + actori +
                '}'+super.toString());
    }
}
