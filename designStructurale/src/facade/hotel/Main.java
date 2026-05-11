package facade.hotel;

public class Main {
    static void main() {
        SistemFacade facade1 = new SistemFacade(new Disponibilitate(true),new Preturi(true)
        ,new Validitate(true));
        facade1.verificaSistemele();

        System.out.println("--------");
        SistemFacade facade2 = new SistemFacade(new Disponibilitate(false),new Preturi(true)
                ,new Validitate(false));
        facade2.verificaSistemele();

    }
}
