package aperativ;

public class Bruschete extends AAperitiv{
    public Bruschete(String nume, String ingrediente) {
        super(nume, ingrediente);
    }

    @Override
    public void serveste() {
        System.out.println("Bruschete"+super.ingrediente+"|"+super.nume);

    }
}
