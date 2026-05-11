package flyweight.restaurant;

public class Main {
    static void main() {
        MasaRezervata masa1 = new MasaRezervata(12,4,"20:20");
        MasaRezervata masa2 = new MasaRezervata(4,1,"12:00");
        MasaRezervata masa3 = new MasaRezervata(21,6,"22:15");

        Flyweight client =ClientFactoryFlyweight.getFlyweight("Alexandra","076666666","" +
                "alexandra@gmail.com");
        client.afisareRezervare(masa1);
        client.afisareRezervare(masa2);
        client.afisareRezervare(masa3);
    }
}
