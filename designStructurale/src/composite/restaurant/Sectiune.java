package composite.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends Meniu{
    List<Meniu> componente;
    public Sectiune(String nume) {
        super(nume);
        this.componente = new ArrayList<>();
    }

    @Override
    public void stergeComponenta(Meniu meniu) {
        componente.remove(meniu);
    }

    @Override
    public void adaugaComponenta(Meniu meniu) {
        componente.add(meniu);
    }

    @Override
    public void afiseazaMneiu(String indentare) {
        System.out.println(indentare+"Seciune: "+super.getNume());
        for(Meniu m: componente){
            m.afiseazaMneiu(indentare+" ");
        }

    }
}
