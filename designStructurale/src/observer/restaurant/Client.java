package observer.restaurant;

public class Client implements Observer{
    private String numeClient;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void anuntaClinetii(String mesaj) {
        System.out.println("Clientul "+ this.numeClient+" a primit mesajul: "+mesaj);
    }
}
