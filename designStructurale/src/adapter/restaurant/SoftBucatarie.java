package adapter.restaurant;

public class SoftBucatarie {
    private String numeProdus;

    public SoftBucatarie(String numeProdus) {
        this.numeProdus = numeProdus;
    }
    public void calculeazaPret(){
        System.out.println("Pretul se calculeaza pentru: "+this.numeProdus);
    }
    public void printeazaFactura(){
        this.calculeazaPret();
        System.out.println("Factura printata cu succes!");
    }
}
