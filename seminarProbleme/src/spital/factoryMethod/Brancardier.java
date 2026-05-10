package spital.factoryMethod;

import spital.factoryMethod.IPersonal;

public class Brancardier implements IPersonal {
    private String nume;
    private int vechime;

    public Brancardier(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }

    public String getNume() {
        return nume;
    }

    public int getVechime() {
        return vechime;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println( "Brancardier{" +
                "nume='" + nume + '\'' +
                ", vechime=" + vechime +
                '}');

    }
}
