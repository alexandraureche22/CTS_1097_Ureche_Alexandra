package observer.restaurant;

public class Restaurant extends Subject{
    private String numeRestaurant;

    public Restaurant(String numeRestaurant) {
        super();
        this.numeRestaurant = numeRestaurant;
    }
    public void adaugaOferta(String oferta){
        System.out.println("\nOferta noua la " + numeRestaurant + ": " + oferta);
        super.notifyObserver("Oferta noua: " + oferta);
    }

    public void stergeOferta(String oferta) {
        System.out.println("\nOferta stearsa");
        super.notifyObserver("oferta stearsa.");
    }
}
