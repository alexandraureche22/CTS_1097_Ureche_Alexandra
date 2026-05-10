package transport.prototype.main;

import transport.prototype.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz a1 = new Autobuz("IS-22-ROK",32);
        Autobuz a2 = (Autobuz) a1.cloneaza();
        System.out.println("sunt la fel?"+(a1==a2));
        System.out.println(a1);
        System.out.println(a2);

    }
}
