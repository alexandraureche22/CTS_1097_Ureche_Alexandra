package composite.transport;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuze extends Flota{
    List<Flota> flote;
    public GrupAutobuze(String nume) {
        super(nume);
        this.flote = new ArrayList<>();
    }

    @Override
    public void adaugaComponenta(Flota flota) {
        flote.add(flota);
    }

    @Override
    public void stergeComponenta(Flota flota) {
        flote.remove(flota);
    }

    @Override
    public void afisareIerarhie(String indenare) {
        System.out.println(indenare+"Grup autobuze"+super.getNume());
        for(Flota f:flote){
            f.afisareIerarhie(indenare+" ");
        }
    }
}
