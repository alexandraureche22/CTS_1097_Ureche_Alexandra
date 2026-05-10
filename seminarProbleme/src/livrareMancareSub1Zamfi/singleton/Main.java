package livrareMancareSub1Zamfi.singleton;

import livrareMancareSub1Zamfi.factory.NotificareFactory;
import livrareMancareSub1Zamfi.factory.NotificareSistem;

public class Main {
    public static void main(String[] args) throws Exception {
        RegistruNotificari registruNotificari = RegistruNotificari.getInstance();
        RegistruNotificari registruNotificari2 = RegistruNotificari.getInstance();
        System.out.println("sunt egale?"+(registruNotificari==registruNotificari2));

        NotificareSistem n1 = NotificareFactory.creeaza("confirmare","#1",
                "comanda confirmat","20:20");
        NotificareSistem n2 = NotificareFactory.creeaza("promotie","#2","promotie 50%"
                ,"19:24");
        NotificareSistem n3 = NotificareFactory.creeaza("livrare","#3","curierul" +
                "a preluat comanda","6:24");
        NotificareSistem n4 = NotificareFactory.creeaza("promotie","#45","promotie 30%" +
                "pt studenti","19:24");
        registruNotificari.adaugaNotificare(n1);
        registruNotificari.adaugaNotificare(n2);
        registruNotificari.adaugaNotificare(n3);
        registruNotificari.afiseaza();
    }
}
