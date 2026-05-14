package chainofresponsability.spital;

public class Main {
    static void main() {
        Client c1 = new Client("ale","076767676","ale@gmail.ro");
        Client c2 = new Client("albosse","8973578","alexutzzz@gmail.ro");
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorMnaager = new NotificatorManager();
        Notificator notificatorEmail = new NotificatorEmail();

        notificatorSMS.setSuccesor(notificatorEmail);
    }
}
