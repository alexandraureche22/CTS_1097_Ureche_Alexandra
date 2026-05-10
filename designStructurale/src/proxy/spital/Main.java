package proxy.spital;

public class Main {
    static void main() {
        ISpital spital = new Spital();
        ISpital spitalProxy = new SpitalProxy(spital);

        Pacient pacient1 = new Pacient("Ion",true);
        Pacient pacient2 = new Pacient("Alex",true);
        Pacient pacient3 = new Pacient("Mihai",false);
        spital.internarePacient(pacient1);
        spital.internarePacient(pacient2);
        spital.internarePacient(pacient3);

        spitalProxy.internarePacient(pacient1);
        spitalProxy.internarePacient(pacient2);
        spitalProxy.internarePacient(pacient3);
    }
}
