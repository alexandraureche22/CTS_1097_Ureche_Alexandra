package eveniment.main.builder;

import eveniment.model.builder.Eveniment;
import eveniment.model.builder.EvenimentBuilder;

public class Main {
    public static void main(String[] args) {
        Eveniment eveniment1 = new EvenimentBuilder("21-12-2026","arene","ureche alexandra")
                .setAreDecoratiuniFlorale(true).setAreServiciiFoto(true).build();
        Eveniment eveniment2= new EvenimentBuilder("12-10-2026","maicuta","denis").setDj(
                "ion").setAreServiciiCatering(true).setCabinaFoto(true).build();
        System.out.println(eveniment1);
        System.out.println(eveniment2);

    }
}
