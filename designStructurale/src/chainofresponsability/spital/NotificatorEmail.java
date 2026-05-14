package chainofresponsability.spital;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getAdresa()!=null && client.getAdresa().isEmpty()){
            System.out.println("Clientul a primit notificarea: "+mesaj);
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client,mesaj);
        }
        else{
            System.out.println("clientul nu are email si nu exista succesor.");
        }
    }
}
