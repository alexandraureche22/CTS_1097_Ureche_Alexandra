package aperativ;

public class Churros extends ADesert{
    public Churros(String nume, String ingrediente, int calorii) {
        super(nume, ingrediente, calorii);
    }

    @Override
    public void serveste() {
        System.out.println("Churros: "+super.nume+"|"+super.ingrediente+"|"+super.calorii);

    }
}
