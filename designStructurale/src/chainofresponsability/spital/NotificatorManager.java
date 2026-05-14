package chainofresponsability.spital;

public class NotificatorManager extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        System.out.println("nu are nici nr de telefon si nici email.");
    }
}
