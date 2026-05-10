package rezervareCombinat.prototypeSingleton.main;

import rezervareCombinat.prototypeSingleton.Client;
import rezervareCombinat.prototypeSingleton.ClientSingletonProto;

public class Main {
    public static void main(String[] args) throws Exception {
        ClientSingletonProto clientSingletonProto = ClientSingletonProto.getInstance();
        Client c1  = new Client("ureche","076767676");
        Client c2 = (Client) c1.cloneaza();
        clientSingletonProto.adaugaClient(c1);
        clientSingletonProto.adaugaClient(c2);
        clientSingletonProto.getClient("ureche");
        System.out.println("egale?"+(c1==c2));
        System.out.println(c1);
        System.out.println(c2);
        c2.setNumarTelefon("078888888");
        System.out.println(c2);
    }
}
