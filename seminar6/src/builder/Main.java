package builder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RezervareBuilderSingleton rezervareBuilder = RezervareBuilderSingleton.getInstanta();

        Rezervare rezervare1 = rezervareBuilder
                .resetare()
                .setAreAsezareGeam(true)
                .setAreScaunErgonomic(true)
                .setGenMuzica("Clasica")
                .build();
        System.out.println(rezervare1);

        Rezervare rezervare2 = rezervareBuilder
                .resetare()
                .setAreMasaDecorata(true)
                .setAreMuzicaAmbientalaPersonalizata(true)
                .setGenMuzica("Pop")
                .build();
        System.out.println(rezervare2);

    }
}