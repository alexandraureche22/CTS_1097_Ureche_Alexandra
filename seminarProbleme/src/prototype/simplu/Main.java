package prototype.simplu;

public class Main {
    public static void main(String[] args) {
        Atestat template = new Atestat("sigiliu 1000x","logo.png");
        Atestat template2 = (Atestat) template.cloneaza();
        System.out.println("egale?"+(template==template2));

        Atestat a1 = (Atestat) template.cloneaza();
        a1.setNume("ureche");
        a1.setCnp("07393747444");
        a1.setDiagnostic("raceala");

        a1.print();


    }
}
