package flyweight.spital;

public class Main {
    static void main() {
        Salon salon1 = new Salon(12.1f,3,5);
        Salon salon2 = new Salon(11.1f,6,5);
        Salon salon3 = new Salon(10.1f,31,9);

        Flyweight pacient = PacientFlyweightFactory.getFlyweight("Alexandra","0767676767",
                "Strada Chibzuintei");
        pacient.afisareDetalii(salon1);
        pacient.afisareDetalii(salon2);
        pacient.afisareDetalii(salon3);


    }
}
