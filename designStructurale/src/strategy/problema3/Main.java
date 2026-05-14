package strategy.problema3;

public class Main {
    static void main() {
        Client c1 = new Client("alex");
        c1.rezerva();
        c1.setTip(new Telefon());
        c1.rezerva();

    }
}
