package rezervareCombinat.prototypeSingleton;

import java.util.HashMap;
import java.util.Map;

public class ClientSingletonProto {
    private static ClientSingletonProto instance;
    private Map<String, Client> clienti = new HashMap<>();

    private ClientSingletonProto() {
    }

    public static ClientSingletonProto getInstance(){
        if(instance == null){
            instance= new ClientSingletonProto();
        }
        return instance;
    }
    public void adaugaClient(Client client){
        clienti.put(client.getNume(),client);
    }
    public Client getClient(String nume) throws Exception {
        if(clienti.containsKey(nume)){
            return (Client) clienti.get(nume).cloneaza();
        }
        throw new Exception("clientul nu a fost gasit");
    }
}
