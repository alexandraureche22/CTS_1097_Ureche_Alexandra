package cafenea.prototype.main;

import cafenea.prototype.Bautura;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bautura b1 = new Bautura("cafea",10.15,350);
        Bautura b2 = b1.clone();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("la fel?"+(b1==b2));



    }
}
