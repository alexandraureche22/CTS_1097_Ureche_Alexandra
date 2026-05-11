package flyweight.spital;

public class PacientFlyweight implements Flyweight{
    private Pacient pacient;

    public PacientFlyweight(Pacient pacient) {
        this.pacient = pacient;
    }
    public void afisareDetalii(Salon salon){
        System.out.println(this.pacient+" "+salon);
    }
}
