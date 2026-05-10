package zoo.builder.main;

import zoo.builder.DosarMedical;
import zoo.builder.DosarMedicalBuilder;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DosarMedical dosar1 = new DosarMedicalBuilder("rock","pisica british").setGreutate(5).setAlergii(List.of("niciuna"))
                .setDataUltimControl("28.03.2026").build();
        DosarMedical dosar2 = new DosarMedicalBuilder("visina","pisica sfinx").setGreutate(6).setAlergii(List.of("alune"))
                .setDataUltimControl("21.6.2025").setNumeIngrijitor("ureche").build();
        DosarMedical dosar3 = new DosarMedicalBuilder("tango","leu").setGreutate(26).setAlergii(List.of("carne de vita","oua"))
                .setDataUltimControl("28.03.2026").setVaccinuri(List.of("vaccin anti rabic","vaccin deparazitare")).setNumeIngrijitor("mona")
                .build();
        DosarMedical dosar4 = new DosarMedicalBuilder("elefantul cici","elefant").setGreutate(87).setAlergii(List.of("niciuna"))
                .setDataUltimControl("12.12.2024").build();
        System.out.println(dosar2.getAlergii());
        System.out.println(dosar1);
        System.out.println(dosar2);
        System.out.println(dosar3);
        System.out.println(dosar4);
    }
}
