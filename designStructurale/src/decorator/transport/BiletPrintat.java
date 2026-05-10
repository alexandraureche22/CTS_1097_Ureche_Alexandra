package decorator.transport;

public class BiletPrintat implements IBilet{
    @Override
    public void afiseazaDetalii() {
        System.out.println("Bilet printat cu succes.");
    }
}
