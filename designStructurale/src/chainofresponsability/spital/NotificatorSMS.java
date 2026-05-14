package chainofresponsability.spital;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getTelefon()!=null && client.getTelefon().isEmpty()){
            System.out.println("Clientul a primit notificarea: "+mesaj);
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client,mesaj);
        }
        else{
            System.out.println("clientul nu are telefon si nu exista succesor.");
        }
    }
}
