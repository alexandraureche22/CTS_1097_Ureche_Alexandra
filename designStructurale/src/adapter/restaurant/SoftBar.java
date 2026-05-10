package adapter.restaurant;

public class SoftBar implements ISoftBar{

    @Override
    public void proceseazaComandaBar() {
        System.out.println("Comanda procesata, fara printare factura.");
    }
}
