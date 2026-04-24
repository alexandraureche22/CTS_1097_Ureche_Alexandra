package state;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Alexandra");
        pacient1.interneaza();
        pacient1.subObservatie();
        pacient1.setStare(new TrecereSubObservatie());
        pacient1.subObservatie();
        pacient1.setStare(new Externare());
        pacient1.externeaza();
    }
}