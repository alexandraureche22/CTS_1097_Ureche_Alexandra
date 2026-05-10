package composite.hotel;

import java.util.ArrayList;
import java.util.List;

public class Locatie extends Destinatie{
    private List<Destinatie> destinatii;
    public Locatie(String nume) {
        super(nume);
        this.destinatii=new ArrayList<>();
    }

    @Override
    public void adaugaDestinatie(Destinatie destinatie) {
        destinatii.add(destinatie);
    }

    @Override
    public void stergeDestinatie(Destinatie destinatie) {
       destinatii.remove(destinatie);
    }

    @Override
    public void afiseazaIerarhie(String indenare) {
        System.out.println(indenare+"Locatie "+super.getNume());
        for(Destinatie d:destinatii){
            d.afiseazaIerarhie(indenare+" ");
        }
    }
}
