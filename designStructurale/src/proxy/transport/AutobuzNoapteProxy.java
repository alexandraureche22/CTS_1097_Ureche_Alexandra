package proxy.transport;

public class AutobuzNoapteProxy implements IAutobuz {
    private IAutobuz autobuz;
    private int nrCalatori;

    public AutobuzNoapteProxy(IAutobuz autobuz, int nrCalatori) {
        this.autobuz = autobuz;
        this.nrCalatori = nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opresteInStatie(String statie) {
        if (nrCalatori > 0) {
            autobuz.opresteInStatie(statie);
        } else {
            System.out.println("Nu exista calatori. Autobuzul se retrage la autobaza.");
        }
    }
}
