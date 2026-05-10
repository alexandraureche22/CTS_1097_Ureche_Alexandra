package iar.prototype.var1;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Reteta r1 = new Reteta("parasinus", Map.of("ingredient1",10.1,"ingredient2",21.8));
        Reteta r2 = (Reteta) r1.cloneaza();
        System.out.println("la fel?"+(r2==r1));
        System.out.println(r1);
        System.out.println(r2);
        r2.getSolutii().put("ingredient3",18.6);
        System.out.println(r2);
    }
}
