package livrareMancareSub1Zamfi.prototype.main;

import livrareMancareSub1Zamfi.factory.NotificareFactory;
import livrareMancareSub1Zamfi.factory.NotificareSistem;
import livrareMancareSub1Zamfi.prototype.Flyer;

public class Main {
    public static void main(String[] args) throws Exception {
        Flyer flyer1 = new Flyer("restaurant italian");
        Flyer flyer2 = new Flyer("restaurant chinezesc");
        Flyer flyer3 = new Flyer("restaurant mexican");

        NotificareSistem n1 = NotificareFactory.creeaza("confirmare","#1",
                "comanda confirmat","20:20");
        NotificareSistem n2 = NotificareFactory.creeaza("promotie","#2","promotie 50%"
                ,"19:24");
        NotificareSistem n3 = NotificareFactory.creeaza("livrare","#3","curierul" +
                "a preluat comanda","6:24");
        NotificareSistem n4 = NotificareFactory.creeaza("promotie","#45","promotie 30%" +
                "pt studenti","19:24");

        Flyer afis1 = (Flyer) flyer1.clonare();
        Flyer afis2 = (Flyer) flyer2.clonare();
        Flyer afis3 = (Flyer) flyer3.clonare();
        afis1.setNotificare(n1);
        afis2.setNotificare(n2);
        afis3.setNotificare(n3);
        afis1.print();
        afis2.print();
        afis3.print();
        System.out.println("----");
        System.out.println("egale?"+(afis1==flyer1));
    }
}
