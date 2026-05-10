package proxy.transport;

public class Autobuz implements IAutobuz{

    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul a oprit in statia: " + statie);
    }
}
