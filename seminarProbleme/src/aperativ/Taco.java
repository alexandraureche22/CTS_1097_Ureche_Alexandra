package aperativ;

public class Taco extends AFelPrincipal{
    public Taco(String nume, boolean esteRece) {
        super(nume, esteRece);
    }

    @Override
    public void serveste() {
        System.out.println("Taco"+super.nume+"|"+super.esteRece);

    }
}
