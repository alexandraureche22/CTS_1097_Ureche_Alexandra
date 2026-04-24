package observer;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Alexandra");
        Pacient pacient2 = new Pacient("Ana");
        Pacient pacient3 = new Pacient("Stefana");

        Spital spital = new Spital("Spitalul Militari");
        spital.addObserver(pacient1);
        spital.addObserver(pacient2);
        spital.addObserver(pacient3);

        spital.notifyPrimireVirus("covid");
        spital.removeObserver(pacient2);
        spital.notifyPrimireVirus("gripa");
    }
}