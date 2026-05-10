package aperativ;

public class Paste extends AFelPrincipal{
    public Paste(String nume, boolean esteRece) {
        super(nume, esteRece);
    }

    @Override
    public void serveste() {
        System.out.println("Paste"+super.nume+"|"+super.esteRece);

    }
}
