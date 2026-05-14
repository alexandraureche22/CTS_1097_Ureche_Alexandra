package chainofresponsability.problema2;

public class Main {
    static void main() {
        Handler consultant = new Consultant();
        Handler scursala = new DirectorScursala();
        Handler general = new DirectorGeneral();
        consultant.setSuccesor(scursala);
        scursala.setSuccesor(general);
        CerereImprumut cerereDespagubire = new CerereImprumut("cerere1",364);
        CerereImprumut cerereDespagubire1 = new CerereImprumut("cerere1",123000);
        consultant.trateaza(cerereDespagubire);
        consultant.trateaza(cerereDespagubire1);

    }
}
