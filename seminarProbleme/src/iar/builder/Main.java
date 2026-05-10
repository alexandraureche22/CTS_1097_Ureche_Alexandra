package iar.builder;

public class Main {
    public static void main(String[] args) {
        PacientBuilder pacientBuilder = PacientBuilder.getInstance();
        Pacient p1 = pacientBuilder.setAreMicDejunInclus(true).setArePapuciDeCamera(true).build();
        Pacient p2 = pacientBuilder.setAreMicDejunInclus(true).setArePapuciDeCamera(true)
                .setAreHalatPentruInterior(true).build();
        Pacient p3 =pacientBuilder.setAreMicDejunInclus(true).setArePapuciDeCamera(true).setArePatRabatabil(
                true).build();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
