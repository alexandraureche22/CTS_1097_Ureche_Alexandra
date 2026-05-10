package composite.hotel;

public class Hotel extends Destinatie{
    private int nrStele;
    private float pret;
    public Hotel(String nume, int stele, float pret) {
        super(nume);
        this.nrStele =stele;
        this.pret=pret;
    }


    @Override
    public void afiseazaIerarhie(String indenare) {
        System.out.println(indenare+"Hotel{" +
                "nume='" + super.getNume() + '\'' +
                ", nrStele=" + nrStele +
                ", pret=" + pret +
                '}');
    }
}
