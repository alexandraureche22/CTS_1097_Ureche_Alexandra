package proxy.restaurant;

public class Main {
    static void main() {
        IRestaurant restaurant = new Restaurant();
        IRestaurant restaurantproxy = new RestaurantProxy(restaurant);

        Rezervare r1= new Rezervare("Alina",4);
        Rezervare r2= new Rezervare("Marius",3);
        Rezervare r3= new Rezervare("Mircea",5);

        restaurant.rezerva(r1);
        restaurant.rezerva(r2);
        restaurant.rezerva(r3);


        restaurantproxy.rezerva(r1);
        restaurantproxy.rezerva(r2);
        restaurantproxy.rezerva(r3);

    }
}
