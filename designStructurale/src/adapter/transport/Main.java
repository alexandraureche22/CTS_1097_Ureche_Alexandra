package adapter.transport;

import java.util.List;

public class Main {
    static void main() {
        TransportTerestru transportTerestru = new TransportTerestru("stb");
        ITRansport itRansport1 = new TransportSubteran();
        ITRansport itRansport2 = new TransportAdapter(transportTerestru);
        List<ITRansport> transporturi = List.of(itRansport1,itRansport2);
        transporturi.forEach(ITRansport::validareBilet);
    }
}
