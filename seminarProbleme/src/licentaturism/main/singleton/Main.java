package licentaturism.main.singleton;

import licentaturism.model.singleton.TourismLicense;

public class Main {
    public static void main(String[] args) {
        TourismLicense tourismLicense = TourismLicense.getInstance();
        TourismLicense tourismLicense1 =TourismLicense.getInstance();
        System.out.println("egale?"+(tourismLicense1==tourismLicense));
        tourismLicense1.setLicenseNumber();
        //tourismLicense.setLicenseNumber();
        Thread thread = new Thread(()->{
            TourismLicense tourismLicense2 = TourismLicense.getInstance();
            System.out.println("egale?"+(tourismLicense1==tourismLicense2));
        });
        thread.start();
    }
}
