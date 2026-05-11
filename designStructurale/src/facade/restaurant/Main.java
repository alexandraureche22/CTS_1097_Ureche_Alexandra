package facade.restaurant;

public class Main {
    static void main() {
        RestaurantFacade facade1 = new RestaurantFacade(new Masa(true),new Curatenie(true),new Servetele(true));
        facade1.pregatesteMasa();
        System.out.println("------");
        RestaurantFacade facade2 = new RestaurantFacade(new Masa(false),new Curatenie(true),new Servetele(true));
        facade2.pregatesteMasa();
        System.out.println("------");
        RestaurantFacade facade3 = new RestaurantFacade(new Masa(true),new Curatenie(false),new Servetele(false));
        facade3.pregatesteMasa();

    }
}
