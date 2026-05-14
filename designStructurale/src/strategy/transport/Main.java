package strategy.transport;

public class Main {
    static void main() {
        Calator calator= new Calator("deni");
        calator.plateste();
        calator.setModPlata(new SMS());
        calator.plateste();
    }
}
