package spital.factoryMethod;

import spital.factoryMethod.IPersonal;

public class Asistent implements IPersonal {
    private String nume;
    private int vechime;

    public Asistent(String nume, int vechime) {
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
        System.out.println( "Asistent{" +
                "nume='" + nume + '\'' +
                ", vechime=" + vechime +
                '}');

    }
}
