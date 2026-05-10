package composite.spital;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraSpital{
    private List<StructuraSpital> structuri;
    public Departament(String nume) {
        super(nume);
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraSpital structura) {
       structuri.add(structura);
    }

    @Override
    public void stergeStructura(StructuraSpital structura) {
        structuri.add(structura);
    }

    @Override
    public void afiseazaIerarhie(String indentare) {
        System.out.println(indentare+"Departament: "+super.getNume());
        for(StructuraSpital s : structuri){
            s.afiseazaIerarhie(indentare+" ");
        }
    }
}
