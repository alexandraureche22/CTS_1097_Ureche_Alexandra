package strategy.problema2;

public class Main {
    static void main(String[] args) {
        Client client = new Client("alex");
        client.reducere();
        client.setiReducere(new ReducereStudenti());
        client.reducere();
    }
}
