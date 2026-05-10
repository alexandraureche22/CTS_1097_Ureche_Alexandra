package combinatii2.factory;

public class VIP extends Camera{
    private boolean minibar;
    private boolean vedereLaMare;
    private boolean jacuzzi;
    private String pachetWelcome;
    public VIP(int nrPersoane, double pret, boolean minibar, boolean vedereLaMare, boolean jacuzzi,
               String pachetWelcome) {
        super(nrPersoane, pret);
        this.minibar = minibar;
        this.vedereLaMare = vedereLaMare;
        this.jacuzzi = jacuzzi;
        this.pachetWelcome = pachetWelcome;
    }
    @Override
    public void afiseaza() {
        System.out.println("VIP: "+getNrPersoane()+" | "+getPret());
    }
    public VIP(VIP alta) {
        super(alta.getNrPersoane(),alta.getPret());
        this.minibar = alta.minibar;
        this.vedereLaMare = alta.vedereLaMare;
        this.jacuzzi = alta.jacuzzi;
        this.pachetWelcome = alta.pachetWelcome;
    }

    @Override
    protected VIP clone() throws CloneNotSupportedException {
        return new VIP(getNrPersoane(), getPret(), minibar, vedereLaMare, jacuzzi, pachetWelcome);
    }
}
