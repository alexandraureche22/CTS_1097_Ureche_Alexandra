package flyweight.restaurant;

public class ClientFlyweight implements Flyweight{
    private Client client;

    public ClientFlyweight(Client client) {
        this.client = client;
    }

    @Override
    public void afisareRezervare(MasaRezervata rezervata) {
        System.out.println(this.client+" "+rezervata);


    }
}
