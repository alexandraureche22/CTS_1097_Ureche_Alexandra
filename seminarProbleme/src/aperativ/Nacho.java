package aperativ;

public class Nacho extends AAperitiv{
    public Nacho(String nume, String ingrediente) {
        super(nume, ingrediente);
    }

    @Override
    public void serveste() {
        System.out.println("Nacho"+super.ingrediente+"|"+super.nume);

    }
}
