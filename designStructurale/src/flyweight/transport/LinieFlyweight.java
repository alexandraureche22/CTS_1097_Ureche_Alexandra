package flyweight.transport;

public class LinieFlyweight implements Flyweight{
    private Linie linie;

    public LinieFlyweight(Linie linie) {
        this.linie = linie;
    }

    @Override
    public void afiseazaLinie(AutobuzLinie autobuzLinie) {
        System.out.println(this.linie+" "+autobuzLinie);

    }
}
