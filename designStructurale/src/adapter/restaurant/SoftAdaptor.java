package adapter.restaurant;

public class SoftAdaptor implements ISoftBar{
    private SoftBucatarie softBucatarie;

    public SoftAdaptor(SoftBucatarie softBucatarie) {
        this.softBucatarie = softBucatarie;
    }

    @Override
    public void proceseazaComandaBar() {
        System.out.println("Comanda procesata prin adaptor.");
        this.softBucatarie.printeazaFactura();
    }
}
