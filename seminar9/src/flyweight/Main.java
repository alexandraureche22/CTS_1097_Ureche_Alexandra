package flyweight;

public class Main{
    static void main() {
        Salon salon1 = new Salon(12.1f,10,20);
        Salon salon2 = new Salon(15.2f,15,5);
        Salon salon3 = new Salon(19.2f,7,12);

        Flyweight pacient = PacientFlyweightFactory.getFlyweight("Alexandra", "076767676", "strada Soarelui 2");
        pacient.afisareDetaliiInternare(salon1);
        pacient.afisareDetaliiInternare(salon2);
        pacient.afisareDetaliiInternare(salon3);


    }
}