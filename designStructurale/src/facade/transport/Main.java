package facade.transport;

public class Main {
    static void main() {
        UsiFacade facade = new UsiFacade(new UsaFata(),new UsaMijloc(), new UsaSpate());
        facade.puneToateUsileInModLiber();
        facade.toateUsileSuntFortate();
    }
}
