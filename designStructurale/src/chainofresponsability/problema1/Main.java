package chainofresponsability.problema1;

public class Main {
    static void main(String[] args) {
        Handler agent = new Agent();
        Handler manager = new Manager();
        Handler director = new Director();
        agent.setSuccesor(manager);
        manager.setSuccesor(director);

        CerereDespagubire cerereDespagubire = new CerereDespagubire("alex",6666f);
        agent.trateaza(cerereDespagubire);
    }
}
