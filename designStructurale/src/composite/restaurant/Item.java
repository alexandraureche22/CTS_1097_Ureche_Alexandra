package composite.restaurant;

public class Item extends Meniu{
    public Item(String nume) {
        super(nume);
    }

    @Override
    public void afiseazaMneiu(String indentare) {
        System.out.println(indentare+"Item: "+super.getNume());
    }
}
