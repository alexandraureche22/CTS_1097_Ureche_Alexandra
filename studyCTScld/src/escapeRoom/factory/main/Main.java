package escapeRoom.factory.main;

import escapeRoom.factory.CameraFactory;
import escapeRoom.factory.ICameraEscape;
import escapeRoom.factory.TipCamera;

public class Main {
    public static void main(String[] args) throws Exception {
        ICameraEscape camera1 = CameraFactory.creeaza(TipCamera.CameraHorror,"Spital abandonat",
                8,90,80.50);
        ICameraEscape camera2 = CameraFactory.creeaza(TipCamera.CameraHorror,"Carnaval",
                7,110,90.50);
        ICameraEscape camera3 = CameraFactory.creeaza(TipCamera.CameraMister,"Prison Break",
                10,90,79.50);
        ICameraEscape camera4 = CameraFactory.creeaza(TipCamera.CameraStiintfica,"Harry Potter",
                9,70,81.90);
        camera3.afiseazaDetalii();
        camera1.afiseazaDetalii();
        camera2.afiseazaDetalii();
        camera4.afiseazaDetalii();
    }
}
