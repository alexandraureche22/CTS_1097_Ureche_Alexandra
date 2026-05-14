package strategy.spital;

public class Main {
    static void main(String[] args) {
        Pacient pacient = new Pacient("alexandra");
        pacient.plateste();
        pacient.setModPlata(new ModCard());
        pacient.plateste();
    }
}
