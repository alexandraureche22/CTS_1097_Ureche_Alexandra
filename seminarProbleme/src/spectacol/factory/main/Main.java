package spectacol.factory.main;

import spectacol.factory.IShow;
import spectacol.factory.ShowFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        IShow s1 = ShowFactory.creeaza("concert","vita de vie","arenele romane",
                "22-12-2026 20:00","rock", List.of("adica desport","ciuplea"));
        IShow s2 = ShowFactory.creeaza("standup","comic club","std maicuta",
                "22-12-2026 20:00",true, List.of("toma","parcalab"));
        IShow s3 = ShowFactory.creeaza("teatru","bio eco","teatru mic",
                "22-12-2026 20:00","rock", List.of("chirila","maia"));
        s1.afiseazaDetalii();
        s2.afiseazaDetalii();
        s3.afiseazaDetalii();

    }
}
