package hotel.main;

import hotel.model.factory.CameraFactory;
import hotel.model.factory.ICamera;

public class MainFactory {
    public static void main(String[] args) throws Exception {
        ICamera c1 = CameraFactory.creeaza("dubla","mini bar inclus",230,4,120);
        ICamera c2 = CameraFactory.creeaza("dubla","mini bar inclus",500,5,238);
        ICamera c3 = CameraFactory.creeaza("suite","mini bar inclus",230,3,4543);
        ICamera c4 = CameraFactory.creeaza("apartament","mini bar inclus," +
                "aer conditionat",230,4,345);
        ICamera c5 = CameraFactory.creeaza("single","mini bar inclus",3424,1,35);
        c1.afiseazaDetalii();
        c2.afiseazaDetalii();
        c3.afiseazaDetalii();
        c4.afiseazaDetalii();
        c5.afiseazaDetalii();
    }
}
