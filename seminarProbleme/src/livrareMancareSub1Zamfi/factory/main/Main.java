package livrareMancareSub1Zamfi.factory.main;

import livrareMancareSub1Zamfi.factory.NotificareFactory;
import livrareMancareSub1Zamfi.factory.NotificareSistem;

public class Main {
    public static void main(String[] args) throws Exception {
        NotificareSistem n1 = NotificareFactory.creeaza("confirmare","#1",
                "comanda confirmat","20:20");
        NotificareSistem n2 = NotificareFactory.creeaza("promotie","#2","promotie 50%"
        ,"19:24");
        NotificareSistem n3 = NotificareFactory.creeaza("livrare","#3","curierul" +
                "a preluat comanda","6:24");
        NotificareSistem n4 = NotificareFactory.creeaza("promotie","#45","promotie 30%" +
                        "pt studenti","19:24");
        n1.afiseazaNotificare();
        n2.afiseazaNotificare();
        n3.afiseazaNotificare();
        n4.afiseazaNotificare();
    }
}
