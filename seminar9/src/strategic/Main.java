package strategic;

public class Main {
    static void main() {
        Pacient pacient = new Pacient("Alexandra");
        pacient.plateste();
        pacient.setModPlata(new CardPlata());
        pacient.plateste();
        pacient.setModPlata(new CashPlata());
        pacient.plateste();
    }
}
