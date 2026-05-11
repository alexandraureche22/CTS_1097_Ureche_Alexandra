package flyweight.hotel;

public class ClientFlyweight implements Flyweight{
    private Client client;

    public ClientFlyweight(Client client) {
        this.client = client;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        System.out.println(this.client+" "+rezervare);
    }
}
