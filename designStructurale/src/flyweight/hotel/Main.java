package flyweight.hotel;

public class Main {
    static void main() {
        Rezervare r1 = new Rezervare(12,5,"20:20");
        Rezervare r2 = new Rezervare(132,4,"12:22");
        Rezervare r3 = new Rezervare(322,2,"13:45");

        Flyweight client = ClientFactoryFlyweight.getFlyweight("Alexandra","076666666","" +
                "alexandra@gmail.com");
        client.afiseazaRezervare(r1);
        client.afiseazaRezervare(r2);
        client.afiseazaRezervare(r3);
    }
}
