package adapter.transport;

import java.sql.SQLOutput;

public class TransportAdapter implements ITRansport{
    private TransportTerestru transportTerestru;

    public TransportAdapter(TransportTerestru transportTerestru) {
        this.transportTerestru = transportTerestru;
    }

    @Override
    public void validareBilet() {
        System.out.println("Bilet validat prin adapter.");
        this.transportTerestru.achizitioneazaBilet();
    }
}
