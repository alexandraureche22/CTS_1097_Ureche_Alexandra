package restaurant.prototype.main;

import restaurant.prototype.ContClient;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContClient c1 = new ContClient("nume","076767676", List.of("papanasi","ciorba de" +
                "vacuta","coca cola 0"));
        ContClient c2 = (ContClient) c1.cloneaza();
        System.out.println("sunt la fel?"+(c1==c2));
        System.out.println(c1);
        System.out.println(c2);
        c2.setTelefon("0788888888");
        System.out.println(c2);

    }
}
