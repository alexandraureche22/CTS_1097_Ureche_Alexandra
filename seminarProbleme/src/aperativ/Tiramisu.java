package aperativ;

public class Tiramisu extends ADesert{
    public Tiramisu(String nume, String ingrediente, int calorii) {
        super(nume, ingrediente, calorii);
    }

    @Override
    public void serveste() {
        System.out.println("Tiramisu: "+super.nume+"|"+super.ingrediente+"|"+super.calorii);

    }
}
