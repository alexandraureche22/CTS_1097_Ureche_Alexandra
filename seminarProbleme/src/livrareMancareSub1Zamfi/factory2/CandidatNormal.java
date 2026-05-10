package livrareMancareSub1Zamfi.factory2;

public class CandidatNormal implements DosarCandidat{
    private String nume;
    private double medie;
    private String diploma;
    private String premiu;

    public CandidatNormal(String nume, double medie, String diploma, String premiu) {
        this.nume = nume;
        this.medie = medie;
        this.diploma = diploma;
        this.premiu = premiu;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void afiseazaNume() {
        System.out.println("Nume candidat: "+getNume());

    }

    @Override
    public String toString() {
        return "CandidatNormal{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                ", diploma='" + diploma + '\'' +
                ", premiu='" + premiu + '\'' +
                '}';
    }

    @Override
    public String getDetalii() {
        return "CandidatNormal{" +
                "nume='" + nume + '\'' +
                ", medie=" + medie +
                ", diploma='" + diploma + '\'' +
                ", premiu='" + premiu + '\'' +
                '}';
    }

    @Override
    public double getMedie() {
        return medie;
    }
}
