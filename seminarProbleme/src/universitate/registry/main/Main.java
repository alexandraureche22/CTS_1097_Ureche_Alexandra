package universitate.registry.main;

import universitate.registry.*;

public class Main {
    public static void main(String[] args) {
        Registry registry = Registry.getInstance();
        IModul c1 = CursArte.getInstance();
        IModul c2 = CursMate.getInstance();
        IModul c3 = CursStiinte.getInstance();
        c1.startCurs();
        registry.inregistreaza(99,c1);
        registry.inregistreaza(1000,c2);
        c1.getDetalii();
        c2.getDetalii();
        c3.getDetalii();
        System.out.println("===========");
        c1.startCurs();
        c2.startCurs();
        c3.startCurs();

    }
}
