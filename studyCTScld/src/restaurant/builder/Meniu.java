package restaurant.builder;

public class Meniu implements IMeniuEveniment {
    private String numeEveniment;
    private int nrPersoane;
    private String aperitivAles;
    private String felPrincipal;
    private String desert;
    private String bautura;
    private boolean servireMasa;
    private boolean includeDecoratiuni;

    public Meniu(String numeEveniment, int nrPersoane, String aperitivAles, String felPrincipal, String desert, String bautura, boolean servireMasa, boolean includeDecoratiuni) {
        this.numeEveniment = numeEveniment;
        this.nrPersoane = nrPersoane;
        this.aperitivAles = aperitivAles;
        this.felPrincipal = felPrincipal;
        this.desert = desert;
        this.bautura = bautura;
        this.servireMasa = servireMasa;
        this.includeDecoratiuni = includeDecoratiuni;
    }

    @Override
    public String getNumeEveniment() {
        return numeEveniment;
    }

    @Override
    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public void afiseazaMeniu() {
        System.out.println("Meniu{" +
                "numeEveniment='" + numeEveniment + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", aperitivAles='" + aperitivAles + '\'' +
                ", felPrincipal='" + felPrincipal + '\'' +
                ", desert='" + desert + '\'' +
                ", bautura='" + bautura + '\'' +
                ", servireMasa=" + servireMasa +
                ", includeDecoratiuni=" + includeDecoratiuni +
                '}');
    }
}
