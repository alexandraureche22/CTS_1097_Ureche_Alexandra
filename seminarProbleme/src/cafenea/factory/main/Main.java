package cafenea.factory.main;

import cafenea.factory.Bautura;
import cafenea.factory.BauturaFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        Bautura b1 = BauturaFactory.creeaza("cafea","iced latte",12.99,500);
        Bautura b2 = BauturaFactory.creeaza("ceai","minty night",9.99,350);
        Bautura b3 = BauturaFactory.creeaza("cafea","matcha strawberyy",19.99,500);
        Bautura b4 = BauturaFactory.creeaza("ciocolatacalda","chocky milky",12.50,400);
        System.out.println(b1.getDetalii());
        b1.preparare();
        System.out.println(b2.getDetalii());
        b2.preparare();
        System.out.println(b3.getDetalii());
        b3.preparare();
        System.out.println(b4.getDetalii());
        b4.preparare();
    }
}
