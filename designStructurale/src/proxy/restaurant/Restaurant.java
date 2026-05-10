package proxy.restaurant;

public class Restaurant implements IRestaurant {
    @Override
    public void rezerva(Rezervare rezervare) {
        System.out.println("Rezervare confirmata pt: "+ rezervare.getNumeClient()+"cu masa de "+
                rezervare.getNrPersoane());
    }
}
