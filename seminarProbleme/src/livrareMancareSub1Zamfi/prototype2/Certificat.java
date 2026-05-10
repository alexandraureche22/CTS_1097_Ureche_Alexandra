package livrareMancareSub1Zamfi.prototype2;

import livrareMancareSub1Zamfi.factory2.DosarCandidat;

public class Certificat implements ICertificat, Cloneable{
    private String sigiliu;
    private String logo;
    private DosarCandidat dosar;

    public Certificat(String sigiliu, String logo) {
        this.sigiliu = sigiliu;
        this.logo = logo;
    }
    public Certificat(Certificat altul) {
        this.sigiliu = altul.sigiliu;
        this.logo = altul.logo;
        this.dosar=altul.dosar;
    }

    public void setDosar(DosarCandidat dosar) {
        this.dosar = dosar;
    }

    @Override
    public String toString() {
        return "Certificat{" +
                "sigiliu='" + sigiliu + '\'' +
                ", logo='" + logo + '\'' +
                ", dosar=" + dosar +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Certificat{" +
                "sigiliu='" + sigiliu + '\'' +
                ", logo='" + logo + '\'' +
                ", dosar=" + dosar +
                '}');
    }

    @Override
    protected ICertificat clone() throws CloneNotSupportedException {
        return new Certificat(sigiliu,logo);
    }
}
