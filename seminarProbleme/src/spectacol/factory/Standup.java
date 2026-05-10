package spectacol.factory;

import java.util.List;

public class Standup extends AShow{
    private boolean areLimbajLicentios;
    private List<String> comedianti;
    public Standup(String nume, String locatie, String data, boolean areLimbajLicentios, List<String>comedianti) {
        super(nume, locatie, data);
        this.areLimbajLicentios=areLimbajLicentios;
        this.comedianti=comedianti;
    }

    @Override
    public String toString() {
        return "Standup{" +
                "areLimbaj='" + areLimbajLicentios + '\'' +
                ", comedianti=" + comedianti +
                '}'+super.toString();
    }

    public boolean isAreLimbajLicentios() {
        return areLimbajLicentios;
    }

    public void setAreLimbajLicentios(boolean areLimbajLicentios) {
        this.areLimbajLicentios = areLimbajLicentios;
    }

    public List<String> getComedianti() {
        return comedianti;
    }

    public void setComedianti(List<String> comedianti) {
        this.comedianti = comedianti;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println( "Standup{" +
                "areLimbaj='" + areLimbajLicentios + '\'' +
                ", comedianti=" + comedianti +
                '}'+super.toString());
    }
}
