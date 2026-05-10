package cafenea.singleton.main;
import cafenea.singleton.Bautura;
import cafenea.singleton.BauturaFactory;
import cafenea.singleton.CasaMarcat;
import cafenea.singleton.ComandaManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CasaMarcat casaMarcat1 = CasaMarcat.getInstance();
        CasaMarcat casaMarcat2 = CasaMarcat.getInstance();
        System.out.println("sunt egale?"+(casaMarcat2==casaMarcat1));

        Bautura b1 = BauturaFactory.creeaza("cafea","iced latte",12.99,500);
        Bautura b2 = BauturaFactory.creeaza("ceai","minty night",9.99,350);
        Bautura b3 = BauturaFactory.creeaza("cafea","matcha strawberyy",19.99,500);
        Bautura b4 = BauturaFactory.creeaza("ciocolatacalda","chocky milky",12.50,400);

        List<Bautura> bauturi = new ArrayList<>();
        casaMarcat1.adaugaBautura(b1);
        casaMarcat1.adaugaBautura(b2);
        System.out.println(casaMarcat1.calculeazaPretTotal());
        casaMarcat1.afiseazaComanda();
    }
}
