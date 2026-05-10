package proxy.restaurant;

public class RestaurantProxy implements IRestaurant {
    private IRestaurant restaurnt;

    public RestaurantProxy(IRestaurant restaurnt) {
        this.restaurnt = restaurnt;
    }

    @Override
    public void rezerva(Rezervare rezervare) {
        if(rezervare.getNrPersoane() >= 4){
            restaurnt.rezerva(rezervare);
        }
        else{
            System.out.println("Rezervare refuzata. Minim 4 persoane!");
        }
    }
}
