package restaurant.prototype;

import java.util.ArrayList;
import java.util.List;

public class ContClient implements ContClientCloneable{
    private String nume;
    private String telefon;
    private List<String> preferinteCulinare;

    public ContClient(String nume, String telefon, List<String> preferinteCulinare) {
        this.nume = nume;
        this.telefon = telefon;
        this.preferinteCulinare = preferinteCulinare;
    }
    public ContClient(ContClient altCont) {
        this.nume = altCont.nume;
        this.telefon = altCont.telefon;
        this.preferinteCulinare = new ArrayList<>(altCont.preferinteCulinare);
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "ContClient{" +
                "nume='" + nume + '\'' +
                ", telefon='" + telefon + '\'' +
                ", preferinteCulinare=" + preferinteCulinare +
                '}';
    }

    @Override
    public ContClientCloneable cloneaza() {
        return new ContClient(nume,telefon,preferinteCulinare);
    }
}
