package hotel.main;

import hotel.model.factory.CameraFactory;
import hotel.model.factory.ICamera;
import hotel.model.singleton.Rezervare;

public class MainSingleton {
    public static void main(String[] args) throws Exception {
        Rezervare rezervare = Rezervare.getInstance();
        Rezervare rezervare1 = Rezervare.getInstance();
        System.out.println("sunt egale?"+(rezervare1==rezervare));

        ICamera c1 = CameraFactory.creeaza("dubla","mini bar inclus",230,4,120);
        ICamera c2 = CameraFactory.creeaza("dubla","mini bar inclus",500,5,238);
        rezervare.adaugaRezervare("A101",c1);
        rezervare.adaugaRezervare("B202",c2);
        rezervare.afiseazaRezervari();
    }
}
