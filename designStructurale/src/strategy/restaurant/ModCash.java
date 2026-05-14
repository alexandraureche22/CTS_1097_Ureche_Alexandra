package strategy.restaurant;

public class ModCash implements ModPlata{
    @Override
    public void plateste() {
        System.out.println("se plateste mod cash");
    }
}
