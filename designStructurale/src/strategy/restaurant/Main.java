package strategy.restaurant;

public class Main {
    static void main() {
        Client client = new Client("deniboss");
        client.plateste();
        client.setModPlata(new ModCard());
        client.plateste();
    }
}
