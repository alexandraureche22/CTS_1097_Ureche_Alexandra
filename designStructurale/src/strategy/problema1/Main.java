package strategy.problema1;

public class Main {
    static void main() {
        Client client = new Client("alexandra");
        client.plateste();
        client.setModPlata(new Aplicatie());
        client.plateste();

    }
}
