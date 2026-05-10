package imagineVirtuala.prototype.main;

import imagineVirtuala.prototype.Calculator;
import imagineVirtuala.prototype.Imagine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Calculator> calculatoare = new ArrayList<>();
        Calculator c1 = new Calculator("lenovo",200.99);
        Calculator c2 = new Calculator("asus",300);
        calculatoare.add(c1);
        calculatoare.add(c2);

        Imagine img1 = new Imagine("png",calculatoare);
        Imagine imgg2 = (Imagine) img1.cloneazaImagine();
        Imagine imgg3 = (Imagine) img1.cloneazaImagine();

        System.out.println("egale?"+(img1==imgg2));
        img1.afisareConfiguratie();
        imgg2.afisareConfiguratie();
        imgg3.afisareConfiguratie();

    }
}
