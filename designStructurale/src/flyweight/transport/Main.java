package flyweight.transport;

public class Main {
    static void main() {
        AutobuzLinie a1 = new AutobuzLinie("mercedes",1999,32);
        AutobuzLinie a2 = new AutobuzLinie("model2",2016,54);
        AutobuzLinie a3 = new AutobuzLinie("model3",2002,12);

        Flyweight linie  = LinieFactoryFlyweight.getFlyweight(1,"Gara de nord","Crangasi");
        linie.afiseazaLinie(a1);
        linie.afiseazaLinie(a2);
        linie.afiseazaLinie(a3);
    }
}
