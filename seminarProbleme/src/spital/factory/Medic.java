package spital.factory;

public class Medic implements IPersonal{
    private String nume;
    private int vechime;

    public Medic(String nume, int vechime) {
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
        System.out.println( "Medic{" +
                "nume='" + nume + '\'' +
                ", vechime=" + vechime +
                '}');

    }
}
