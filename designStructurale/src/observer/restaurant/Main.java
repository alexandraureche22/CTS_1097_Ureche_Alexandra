package observer.restaurant;

public class Main {
    static void main(String[] args) {
        Client c1 = new Client("ale");
        Client c2= new Client("ioi");
        Client c3 = new Client("deni");

        Restaurant r1 = new Restaurant("yolo");
        r1.adaugaObserver(c1);
        r1.adaugaObserver(c2);
        r1.adaugaObserver(c3);

        r1.adaugaOferta("oferta super extra noua");
        r1.stergeObserver(c2);

    }
}
