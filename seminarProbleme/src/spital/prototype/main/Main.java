package spital.prototype.main;

import spital.prototype.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> lista1 = new HashMap<>();
        lista1.put("apa",12.0);
        lista1.put("magneziu",13.2);
        Reteta r1 = new Reteta("parasinus",lista1);

        Reteta r2 = (Reteta) r1.cloneaza();
        System.out.println("sunt egale?"+(r2==r1));
        r2.setNume("parasinus forte");
        System.out.println(r1);
        System.out.println(r2);
    }
}
